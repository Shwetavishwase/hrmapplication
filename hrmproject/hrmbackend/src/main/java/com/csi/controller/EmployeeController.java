package com.csi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeServiceImpl;

	@PostMapping("/")
	public ResponseEntity<Employee> saveData(Employee employee) {
		return ResponseEntity.ok(employeeServiceImpl.saveData(employee));
	}

	@GetMapping("/{empId}")
	public ResponseEntity<Optional<Employee>> getDataByid(@PathVariable int empId) {
		return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
	}

	@GetMapping("/")
	public ResponseEntity<List<Employee>> getAllData() {
		return ResponseEntity.ok(employeeServiceImpl.getAllData());
	}

	@PutMapping("/{empId}")
	public ResponseEntity<Employee> updateData(@PathVariable int empId, @RequestBody Employee employee) {
		Employee employee1 = employeeServiceImpl.getDataById(empId)
				.orElseThrow(() -> new RecordNotFoundException("Employee id does not exist"));

		employee1.setEmpFirstName(employee.getEmpFirstName());
		employee1.setEmpLastName(employee.getEmpLastName());
		employee1.setEmpEmailId(employee.getEmpEmailId());

		return ResponseEntity.ok(employeeServiceImpl.updateData(employee1));
	}

	@DeleteMapping("/{empId}")
	public ResponseEntity<String> deleteData(@PathVariable int empId) {
		employeeServiceImpl.deleteData(empId);
		return ResponseEntity.ok("Data deleted successfully");
	}
}
