package com.marticus.customer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.customer.entity.CustomerEntity;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

	CustomerEntity findCustomerById(long id);
	
	List<CustomerEntity> findCustomerByCustomerName (String customerName);

	List<CustomerEntity> findCustomerByCustomerNameContaining(String name);

	List<CustomerEntity> findCustomerByCustomerNameContainingAndCustomerCode(String name, String custid);

}
