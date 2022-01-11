package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student3 {

	private long studentId;
	private String studentName;
	private Set<CoachingCenter> coachingcenters = new HashSet<CoachingCenter>(0);
	
	
	public Student3() {
		
	}
	
	public Student3(String studentName, Set<CoachingCenter> coachingcenters)
	{
		this.studentName = studentName;
		this.coachingcenters = coachingcenters;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_CENTER", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CENTER_ID") })
	public Set<CoachingCenter> getCoachingcenters() {
		return coachingcenters;
	}
	public void setCoachingcenters(Set<CoachingCenter> coachingcenters) {
		this.coachingcenters = coachingcenters;
	}
	
	
	
}
