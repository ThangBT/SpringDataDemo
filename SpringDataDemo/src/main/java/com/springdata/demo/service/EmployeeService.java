package com.springdata.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.demo.entity.Employee;
import com.springdata.demo.payroll.EmployeeExistingException;
import com.springdata.demo.payroll.EmployeeNotFoundException;
import com.springdata.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	public EmployeeRepository er;

	public Employee createEmployee(Employee emp) {
		if (er.existsById(emp.getEmployeeID())) {
			throw new EmployeeExistingException(emp.getEmployeeID());
		} else {
			er.save(emp);
		}

		return er.save(emp);
	}

	public List<Employee> getAllEmployee() {
		return er.findAll();
	}

	public Employee getEmployeeByID(int id) {
		return er.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	public Employee updateData(int id, Employee emp) {
		return er.findById(id).map(employee -> {
			employee.setEmployeeName(emp.getEmployeeName());
			employee.setEmployeeAge(emp.getEmployeeAge());
			employee.setEmployeeGender(emp.getEmployeeGender());

			return er.save(employee);
		}).orElseGet(() -> {
			emp.setEmployeeID(id);
			return er.save(emp);
		});
	}

	public void deleteEmployeeByID(int id) {
		if (er.existsById(id)) {
			er.deleteById(id);
		} else {
			throw new EmployeeNotFoundException(id);
		}
	}
}
