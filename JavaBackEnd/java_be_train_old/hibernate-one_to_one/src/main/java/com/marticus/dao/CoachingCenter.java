package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "COACHING_CENTERS")
public class CoachingCenter {
	
	private long centerId;
	private String centerName;
	private String subject;
	
	public CoachingCenter() {
		
	}
	public CoachingCenter(String centerName, String subject)
	{
		this.centerName = centerName;
		this.subject = subject;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "CENTER_ID")
	public long getCenterId() {
		return centerId;
	}
	public void setCenterId(long centerId) {
		this.centerId = centerId;
	}
	
	@Column(name = "C_NAMES", nullable = false, length=10)
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	@Column(name = "SUBJECT", nullable = false, length=15)
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	
	
}
