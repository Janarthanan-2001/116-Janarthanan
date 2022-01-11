package com.marticus.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.model.Customer;



@RestController
@RequestMapping("/customers")
public class Controller {
	
	
@PostMapping("/")
ResponseEntity<Void>saveCustomer(@RequestBody Customer cust)
{
	
	System.out.println(cust.getCustomerCode());


	return ResponseEntity.status(HttpStatus.CREATED)
			 .header("H1", "Value 1")
			 .header("H2", "Value 2")
			 .build();
	


}

@GetMapping("/")
ResponseEntity<List<Customer>>getAllCustomers()
{
	
	  List <Customer> custList =new ArrayList<Customer>();
	  
	  Customer cus1=new Customer(1,"Moumita","cust002");
	  Customer cus11=new Customer(1,"Amita","cust002");
	  custList.add(cus1);
	  custList.add(cus11);
	  

	return ResponseEntity.status(HttpStatus.CREATED).body(custList);
			 
			  

}

}