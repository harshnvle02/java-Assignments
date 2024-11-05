package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFound;

public interface EmployeeService {

	void readFile(String string);

	void addNewEmployee();

	boolean deleteStudentId(int id) throws EmployeeNotFound;

	boolean updateStudentById(int id1, double sal) throws EmployeeNotFound;

	List<Employee> display();

	void witeFile(String string);

}
