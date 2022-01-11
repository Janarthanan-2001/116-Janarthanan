package com.marticus.EmployeeManagement.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.EmployeeManagement.Entity.User;
import com.marticus.EmployeeManagement.Service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserController {

	    @Autowired
	    UserService userService;
	    
	    //TO CREATE AN NEW USER
	    @PostMapping("/")  	   
	    public ResponseEntity<String> createNewUser(@RequestBody User user) {
	    	String strCreateStatus="User Created successfully";
	    	userService.createNewUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(strCreateStatus);
	    }
	    
	    //TO READ AN EXISTING USER   
        @GetMapping("/{id}")      
        public ResponseEntity<User> readUser(@PathVariable long id)
        	{
        		User user= userService.findUserById(id);
        		return ResponseEntity.ok(user);
            }
            
        //TO UPDATE AN EXISTING USER   
      	@PutMapping("/{id}")
        public ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable long id) 
        {	
        	String strUpdateStatus="User updated successfully";
        	userService.updateUser(user);
    		return ResponseEntity.ok().body(strUpdateStatus);
    	}
    	 
        //TO DELETE AN EXISTING USER
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deleteUser(@PathVariable long id) 
        {
	      	String body="User deleted succesfully";
	      	
	    	Boolean delStatus=userService.deleteUserById(id);
	    		if(!delStatus) 
	    		{
	    			body="could not delete the User";
	    		}
	    		return ResponseEntity.ok().body(body);
	   	}
	   
	   //TO LIST ALL USERS
       @GetMapping("/userslist")
	   public ResponseEntity<List<User>>listAllUsers() 
	   
       {
    	   List<User> user=userService.listAllUsers();
    	   return ResponseEntity.ok(user);
   
       }
       
}

