package com.csi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeDao employeeDaoImpl;
	
	@Override
	public Employee saveData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.saveData(employee);
	}

	@Override
	public Optional<Employee> getDataById(int empId) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getDataById(empId);
	}

	@Override
	public List<Employee> getAllData() {
		// TODO Auto-generated method stub
		return employeeDaoImpl.getAllData();
	}

	@Override
	public Employee updateData(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDaoImpl.updateData(employee);
	}

	@Override
	public void deleteData(int empId) {
		employeeDaoImpl.deleteData(empId);

	}

}
