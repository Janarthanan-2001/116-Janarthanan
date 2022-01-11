package com.employee.managementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.managementsystem.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUsersById(int id);

	User findUsersByUserName(String userName);

	User findUsersByUserNameAndPassword(String userName, String password);

}
