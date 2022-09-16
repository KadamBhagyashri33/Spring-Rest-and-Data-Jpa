package com.springRestAndDataJpaWithSpringBoot.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springRestAndDataJpaWithSpringBoot.model.Employee;
import com.springRestAndDataJpaWithSpringBoot.respository.EmployeeRepository;
import com.springRestAndDataJpaWithSpringBoot.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRespository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return empRespository.findAll();
	}

	@Override
	public Employee getEmpById(long id) {
		
		return empRespository.findById(id).get();
	}

	@Override
	public Employee createEmp(Employee emp) {
		
		return empRespository.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp ) {
	

		return empRespository.save(emp);
	}

	@Override
	public void deleteEmpById(long id) {
		 empRespository.deleteById(id);
		 	}

}
