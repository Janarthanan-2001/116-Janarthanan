package com.marticus.dao;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {
	
	private long personId;
	private String name;
	private Aadhar aadhar;
	
	public Person() {
		
	}
	
	public Person(String name , Aadhar aadhar )
	{
		this.name = name;
		this.aadhar = aadhar;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID")
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	@Column(name = "NAME", nullable = false, length = 100)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	public Aadhar getAadhar() {
		return this.aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	
	

}
