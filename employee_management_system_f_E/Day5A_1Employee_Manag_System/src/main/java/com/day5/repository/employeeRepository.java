package com.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day5.entity.Employee;

public interface employeeRepository extends JpaRepository<Employee, Integer>{

}
