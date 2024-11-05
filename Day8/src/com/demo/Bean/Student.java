package com.demo.Bean;


public class Student extends Person {


	private int studId;
	private String name;
	private String address;
	private int  m1;
	
	
	public Student() {
		super();
	}

	
	public Student(int studId, String name, String address, int m1, int m2) {
		super();
		this.studId = studId;
		this.name = name;
		this.address = address;
		this.m1 = m1;
		this.m2 = m2;
	}
	
	public Student(int studId) {
		super();
		this.studId = studId;
	}

	private int  m2;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", address=" + address + ", m1=" + m1 + ", m2=" + m2
				+ "]";
	}
	
}
