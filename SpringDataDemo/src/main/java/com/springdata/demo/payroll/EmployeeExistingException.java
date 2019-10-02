package com.springdata.demo.payroll;

public class EmployeeExistingException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeExistingException(Integer id) {
		super("This employeeID " + id + " has already existed.");
	}
}
