package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFound;

public interface EmployeeDaoService {

	void readFromFile(String filename);

	void saveAll(Employee e);

	boolean deleteStudentById(int id) throws EmployeeNotFound;

	boolean updateById(int id1, double sal) throws EmployeeNotFound;

	List<Employee> getAll();

	void writeFile(String fname);

}
