package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "account")  
@Inheritance(strategy=InheritanceType.JOINED)  
public class Account {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	      
	@Column(name = "id")  
	private int id;  
	
	@Column(name = "accountid")  
	private String accountId;
	
	@Column(name = "acholdername")  
	private String acHoldetName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAcHoldetName() {
		return acHoldetName;
	}

	public void setAcHoldetName(String acHoldetName) {
		this.acHoldetName = acHoldetName;
	}
	
	

}
