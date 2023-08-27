package com.day5.services;

import java.util.List;

import com.day5.entity.Employee;

public interface employeeService {

	public void addEmployee(Employee emp);
	
	public void updateEmployee(Employee emp, int empid);
	
	public void deleteEmployee(int empId);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(int empid);
	
}
