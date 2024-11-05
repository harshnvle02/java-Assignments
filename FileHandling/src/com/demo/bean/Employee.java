package com.demo.bean;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empid;
	private String name;
	private double salary;
	private int bonus;
	public Employee() {
		super();
	}
	
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	
	public boolean equals(Object obj) {
		
		return this.empid == ((Employee)obj).empid;
	}

	public Employee(int empid, String name, double salary, int bonus) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "TestEmployee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	
}
