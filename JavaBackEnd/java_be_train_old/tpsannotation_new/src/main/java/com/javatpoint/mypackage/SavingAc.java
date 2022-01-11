package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="savingac")  
@PrimaryKeyJoinColumn(name="ID") 
public class SavingAc extends Account {
	
	
	@Column(name="interest")  
    private Double interest;

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}


	
	
}
