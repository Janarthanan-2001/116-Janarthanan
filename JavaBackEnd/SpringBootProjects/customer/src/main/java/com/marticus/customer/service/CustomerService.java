package com.marticus.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.customer.entity.CustomerEntity;
import com.marticus.customer.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public void saveCustomer(CustomerEntity customerEnty) {
		// TODO Auto-generated method stub
		customerRepository.save(customerEnty);
	}

	public CustomerEntity findCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerById(id);

	}

	public List<CustomerEntity> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll(Sort.by(Sort.Direction.ASC,"id"));
	}

	public Boolean deleteCustomerById(long id) {
		
		CustomerEntity cust = customerRepository.findCustomerById(id);
		if(cust != null)
		{
			customerRepository.delete(cust);
			return true;
		}
		return false;
	}

	public void updateCustomer(CustomerEntity cust) {
	
		CustomerEntity dptDB = customerRepository.findCustomerById(cust.getId());
		dptDB.setCustomerCode(cust.getCustomerCode());
		dptDB.setCustomerName(cust.getCustomerName());
		
		customerRepository.save(dptDB);
	}

	public List<CustomerEntity> findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerByCustomerName(name);
	}

	public List<CustomerEntity> findCustomerByNameLike(String name) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerByCustomerNameContaining(name);
	}

	public List<CustomerEntity> findCustomerByNameAndCustomerId(String name, String custid) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerByCustomerNameContainingAndCustomerCode(name,custid);
	}
	
	

}
