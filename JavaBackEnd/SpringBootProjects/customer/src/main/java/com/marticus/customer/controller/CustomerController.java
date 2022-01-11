package com.marticus.customer.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.marticus.customer.entity.CustomerEntity;
import com.marticus.customer.entity.RestData;
import com.marticus.customer.service.CustomerService;
import com.marticus.customer.utility.JwtToken;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;



@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	

	@Autowired
	RestTemplate template;
	
	@PostMapping("/")
	public ResponseEntity<Void> saveDepartment (@RequestBody CustomerEntity customerEnty)
	{
		customerService.saveCustomer(customerEnty);
		
		return ResponseEntity.status(HttpStatus.CREATED).header("creation status","created").build();
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<CustomerEntity> getCustomerById (@PathVariable long id)
	{
		CustomerEntity cust = customerService.findCustomerById(id);
		
		return ResponseEntity.ok(cust);
	}
	
	@GetMapping("/")
	public  ResponseEntity<List<CustomerEntity>> getCustomerList() {
		
		List<CustomerEntity> cust = customerService.findAllCustomer();
		return ResponseEntity.ok(cust);
		
	}
	
	@DeleteMapping("/{id}")
	public  ResponseEntity<String> deleteCustomerById(@PathVariable long id) {
		
		String body = "Record deleted successfully";
		
		Boolean delStatus = customerService.deleteCustomerById(id);
		if(!delStatus)
		{
			body = "could not delete the record";
		}
			return ResponseEntity.ok().body(body);
		
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateCustomer(@RequestBody CustomerEntity cust)
	{
		String strUpdateStatus = "Data updated successfully";
		customerService.updateCustomer(cust);
		return ResponseEntity.ok().body("ok");
	}
	

	@GetMapping("/fetch/{name}")
	public ResponseEntity<List<CustomerEntity>> getCustomerByName(@PathVariable String name)
	{
		List<CustomerEntity> customerEntity= customerService.findCustomerByName(name);
		return ResponseEntity.ok(customerEntity);
	}
	
	
	@GetMapping("/fetchp/{name}")
	public ResponseEntity<List<CustomerEntity>> getCustomerByNameLike(@PathVariable String name)
	{
		List<CustomerEntity> customerEntity= customerService.findCustomerByNameLike(name);
		return ResponseEntity.ok(customerEntity);
	}
	
	@GetMapping("/fetchp/{name}/{custid}")
	public ResponseEntity<List<CustomerEntity>> getCustomerByNameLike(@PathVariable String name,@PathVariable String custid)
	{
		List<CustomerEntity> customerEntity= customerService.findCustomerByNameAndCustomerId(name,custid);
		return ResponseEntity.ok(customerEntity);
	}
	
	@GetMapping("/callfreeapi")
	public ResponseEntity<RestData> getRestDatas()
	{
		RestData rstdata= new RestData();
		String url="https://www.boredapi.com/api/activity";
		rstdata=template.getForObject(url, RestData.class) ;
		
		return ResponseEntity.ok(rstdata);
		
		
	}
	
	@GetMapping("/callfreeapi/{name}")
	public ResponseEntity<RestData> getRestDatas(@PathVariable String name)
	{
		RestData rstdata= new RestData();
		String url="https://api.genderize.io/?name="+name;
		//RestTemplate template=new RestTemplate();
		rstdata=template.getForObject(url, RestData.class) ;
		
		return ResponseEntity.ok(rstdata);
	}
	
	@GetMapping("/login/{user}/{pwd}")
	public ResponseEntity<String> login(@PathVariable String user, 
			@PathVariable String pwd)
	{
		 
		String str=getJWTToken();
		//String str=JwtToken.getJWTToken();
		
		
		return ResponseEntity.ok(str);
	}
	
	private String getJWTToken() {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				//.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}


}
