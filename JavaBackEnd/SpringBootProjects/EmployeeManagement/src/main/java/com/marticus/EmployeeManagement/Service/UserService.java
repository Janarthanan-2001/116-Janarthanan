package com.marticus.EmployeeManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.marticus.EmployeeManagement.Entity.User;
import com.marticus.EmployeeManagement.Repository.UserRepository;








@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	//TO CREATE AN USER
	public long createNewUser(User user) {
		// TODO Auto-generated method stub
//		 user.setPassword(new BCryptPasswordEncoder().encode("password"));
	        userRepository.save(user);
	        return user.getId();
		
	}
	//TO READ AN EXISTING USER
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return userRepository.findUserById(id);
	}
	//TO UPDATE EXISTING USER
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		User userDb=userRepository.findUserById(user.getId());
		userDb.setUserId(user.getUserId());
		userDb.setPassword(user.getPassword());
		userRepository.save(userDb);
		
	}
	//TO DELETE AN EXISTING USER
	public Boolean deleteUserById(long id) {
		// TODO Auto-generated method stub
		User user=userRepository.findUserById(id);
		if(user!=null)
		{
			userRepository.delete(user);
			return true;
		}
		return false;
//		return null;
	}
	//TO LIST ALL USERS
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll(Sort.by(Sort.Direction.ASC,"userId"));
	}


	
	
}
