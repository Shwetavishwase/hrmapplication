package com.csi.dao;

import java.util.List;
import java.util.Optional;

import com.csi.model.Employee;

public interface EmployeeDao {
	
	public Employee saveData(Employee employee);
	
	public Optional<Employee> getDataById(int empId);
	
	public List<Employee> getAllData();
	
	public Employee updateData(Employee employee);
	
	public void deleteData(int empId);

}
