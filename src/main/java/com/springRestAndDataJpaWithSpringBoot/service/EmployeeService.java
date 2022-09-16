package com.springRestAndDataJpaWithSpringBoot.service;

import java.util.List;

import com.springRestAndDataJpaWithSpringBoot.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmpById(long id);
	public Employee createEmp(Employee emp);
	public Employee updateEmp(Employee emp);
	public void deleteEmpById(long id);
	

}
