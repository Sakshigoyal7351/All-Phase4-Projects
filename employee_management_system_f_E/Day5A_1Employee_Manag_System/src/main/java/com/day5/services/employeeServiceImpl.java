package com.day5.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day5.entity.Employee;
import com.day5.repository.employeeRepository;

@Service
public class employeeServiceImpl implements employeeService{

	@Autowired
	private employeeRepository empRepository;

	public employeeRepository getEmpRepository() {
		return empRepository;
	}

	public void setEmpRepository(employeeRepository empRepository) {
		this.empRepository = empRepository;
	}

	@Override
	public void addEmployee(Employee emp) {
		empRepository.save(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, int empid) {
		empRepository.save(emp);
		
	}

	@Override
	public void deleteEmployee(int empId) {
		empRepository.deleteById(empId);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int empid) {
		
	  return empRepository.findById(empid).get();
	
	}
	
	
	
	
}
