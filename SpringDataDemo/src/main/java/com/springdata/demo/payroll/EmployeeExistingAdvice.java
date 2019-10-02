package com.springdata.demo.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeExistingAdvice {

	@ResponseBody
	@ExceptionHandler(EmployeeExistingException.class)
	@ResponseStatus(HttpStatus.SEE_OTHER)
	public String employeeExistingResponse(EmployeeExistingException ex) {
		return ex.getMessage();
	}
}
