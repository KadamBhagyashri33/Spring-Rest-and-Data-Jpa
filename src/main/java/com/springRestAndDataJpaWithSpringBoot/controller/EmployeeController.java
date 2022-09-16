package com.springRestAndDataJpaWithSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRestAndDataJpaWithSpringBoot.model.Employee;
import com.springRestAndDataJpaWithSpringBoot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
@GetMapping("/employees")	
public List<Employee> retrieveListOfEmp()
{
	return empService.getAllEmployees();
}

@GetMapping("/employees/{id}")
public Employee retrieveById(@PathVariable("id") long id)
{
	return empService.getEmpById(id);
}

@PostMapping("/employees")
public Employee createEmployee(@RequestBody Employee emp)
{
	return empService.createEmp(emp);
}

@PutMapping("/employees/{id}")
public void updateEmployee(@RequestBody Employee emp,@PathVariable("id") long id)
{
	Employee empl=empService.getEmpById(id);
	if(empl!=null) {
		 empService.updateEmp(emp);
	}
	}

@DeleteMapping("/employees/{id}")
public void deleteEmp(@PathVariable("id")long id)
{
	empService.deleteEmpById(id);
	System.out.println("deleted successfully");

	
}



}
