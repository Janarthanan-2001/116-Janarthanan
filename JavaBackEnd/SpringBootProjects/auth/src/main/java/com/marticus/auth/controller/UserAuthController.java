package com.marticus.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.auth.service.AuthService;
import com.marticus.auth.utility.JwtToken;

@RestController
@RequestMapping("/")
public class UserAuthController {
	
	@Autowired
    AuthService authService;
	
	@GetMapping("login/{name}/{pass}")
	ResponseEntity<String> login(@PathVariable("name")String userName, @PathVariable("pass")String password)
	{
		String str="Token Not Available";
		Boolean result = authService.authenticate(userName, password);
		if(result)
		{
			str = JwtToken.getJWTToken(userName);
		}
		return ResponseEntity.ok(str);
	}

}
