package com.marticus.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.auth.entity.User;
import com.marticus.auth.repo.AuthRepository;


@Service
public class AuthService {
	
	@Autowired
    AuthRepository authRepository;

	public Boolean authenticate(String userName, String password) {

		List<User> listUser = authRepository.findByUserNameAndPassword(userName, password);
		if((null != listUser)&(listUser.size()>=0))
		{
			return true;
		}
		return false;
	}

}
