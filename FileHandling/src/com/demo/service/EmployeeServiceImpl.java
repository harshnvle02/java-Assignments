package com.demo.service;
import com.demo.dao.*;
import com.demo.exception.EmployeeNotFound;

import java.util.List;
import java.util.Scanner;
import com.demo.bean.*;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDaoService dao;
	Scanner sc = new Scanner(System.in);
	
	public EmployeeServiceImpl() {
		super();
		dao = new EmployeeDaoServiceImpl();
	}


	@Override
	public void readFile(String filename) {
		
		dao.readFromFile(filename);
	}


	@Override
	public void addNewEmployee() {
	
		System.out.println("Enter employee id:");
		int empid = sc.nextInt();
		 sc.nextLine();
		System.out.println("Enter employee name:");
		String name = sc.nextLine();
		
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		
		System.out.println("Bonus");
		int bonus  = sc.nextInt();
		
		Employee e = new Employee(empid, name, salary, bonus);
		
		dao.saveAll(e);
		
	}


	@Override
	public boolean deleteStudentId(int id) throws EmployeeNotFound {
		return dao.deleteStudentById(id);
		
		
	}


	@Override
	public boolean updateStudentById(int id1 , double sal) throws EmployeeNotFound {
	
		return dao.updateById(id1, sal);
	}


	@Override
	public List<Employee> display() {
		
		return dao.getAll();
	}


	@Override
	public void witeFile(String fname){
		dao.writeFile(fname);
		
	}


	
}
