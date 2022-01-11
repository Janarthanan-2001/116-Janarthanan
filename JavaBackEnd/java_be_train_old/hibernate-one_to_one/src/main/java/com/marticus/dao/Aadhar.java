package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AADHAR")
public class Aadhar {
	
	private long aadharId;
	private String aadharNumber;
	
	public Aadhar() {
		
	}
	
	public Aadhar(String aadharNumber)
	{
		this.aadharNumber = aadharNumber;
	}

	@Id
	@GeneratedValue
	@Column(name = "AADHAR_ID")
	public long getAadharId() {
		return aadharId;
	}
	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}
	
	@Column(name = "AADHAR_NUMBER", nullable = false, length=250)
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	

}
