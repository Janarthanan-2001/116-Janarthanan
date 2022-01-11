package com.marticus.EmployeeManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.EmployeeManagement.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findUserById(long id);
	

}
