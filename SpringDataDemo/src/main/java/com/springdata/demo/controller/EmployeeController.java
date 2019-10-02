package com.springdata.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.demo.entity.Employee;
import com.springdata.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeService es;

	@ResponseBody
	@PostMapping("create")
	public Employee createData(@RequestBody Employee emp) {
		return es.createEmployee(emp);
	}

	@ResponseBody
	@GetMapping("employees")
	public List<Employee> getAllEmployee() {
		return es.getAllEmployee();
	}

	@ResponseBody
	@GetMapping("employees/{id}")
	public Employee getEmployeeByID(@PathVariable("id") Integer id) {
		return es.getEmployeeByID(id);
	}

	@ResponseBody
	@PutMapping("update/{id}")
	public Employee updateData(@PathVariable("id") Integer id, @RequestBody Employee emp) {
		return es.updateData(id, emp);
	}

	@ResponseBody
	@DeleteMapping("delete/{id}")
	public void deleteEmployeeByID(@PathVariable("id") Integer id) {
		es.deleteEmployeeByID(id);
	}
}
