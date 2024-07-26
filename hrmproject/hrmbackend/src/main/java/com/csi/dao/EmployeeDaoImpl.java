package com.csi.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee saveData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> getDataById(int empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId);
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteData(int empId) {
		employeeRepository.deleteById(empId);

	}

}
