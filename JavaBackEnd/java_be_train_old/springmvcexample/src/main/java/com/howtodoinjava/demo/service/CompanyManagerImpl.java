package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.CompanyDao;
import com.howtodoinjava.demo.model.CompanyVo;


@Service
@Scope("singleton")
public class CompanyManagerImpl implements CompanyManager {

	
	
		@Autowired
		CompanyDao companyDao;
		
		public CompanyManagerImpl(CompanyDao companyDaoConstructor)
		{
			this.companyDao=companyDaoConstructor;
		}
		
		public CompanyManagerImpl()
		{
			
		}
		public void setCompanyDao(CompanyDao companyDao)
		{
			this.companyDao=companyDao;
		}
		public List<CompanyVo> getAllCompanyNames() {
			// TODO Auto-generated method stub
			return companyDao.getAllCompanyNames();
		}

	}



