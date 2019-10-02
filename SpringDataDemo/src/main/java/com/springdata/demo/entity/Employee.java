package com.springdata.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	private int employeeID;

	@Column(name = "Name", nullable = false, length = 50)
	private String employeeName;

	@Column(name = "Age", nullable = false, length = 5)
	private int employeeAge;

	@Column(name = "Gender", nullable = false, length = 2)

	private int employeeGender;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(int employeeGender) {
		this.employeeGender = employeeGender;
	}

	@Override
	public String toString() {
		return "ID: " + this.employeeID + "\nName: " + this.employeeName;
	}
}
