package com.springdata.demo.payroll;

public class EmployeeNotFoundException extends RuntimeException {
	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Integer id) {
		super("Can not found employee with id: " + id);
	}
}
