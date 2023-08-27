package com.day5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.day5.entity.Employee;
import com.day5.services.employeeService;

@RestController
public class EmployeeController {

	@Autowired
	private employeeService empService;
	
	
	
	public employeeService getEmpService() {
		return empService;
	}



	public void setEmpService(employeeService empService) {
		this.empService = empService;
	}



	@RequestMapping("/work")
	public String test()
	{
		return "yes project is working!!!!";
	}
	
	
	//@RequestMapping(method=RequestMethod.POST, value= "/employee")
	@PostMapping("/employee")
	public void addemployee(@RequestBody Employee emp)
	{
		empService.addEmployee(emp);
	}
	
	
	//@RequestMapping(method = RequestMethod.PUT, value="/employee/{empid}")
	@PutMapping("/employee/{empid}")
	public void updateemployee(@RequestBody Employee emp, @PathVariable int empid)
	{
		empService.updateEmployee(emp,empid );
	}
	
	//@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{empid}")
	@DeleteMapping("/employee/{empid}")
	public void deleteemployee(@PathVariable int empid)
	{
		empService.deleteEmployee(empid);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllemployee()
	{
		return empService.getAllEmployee();
	}
	
	@GetMapping("/employee/{empid}")
	public Employee getemployee(@PathVariable int empid)
	{
		return empService.getEmployeeById(empid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
