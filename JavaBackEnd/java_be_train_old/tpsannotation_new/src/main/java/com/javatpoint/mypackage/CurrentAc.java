package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="regularemployee103")  
@PrimaryKeyJoinColumn(name="ID")  
public class CurrentAc extends Account {
	
	@Column(name="salary")    
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}  

	
	
}
