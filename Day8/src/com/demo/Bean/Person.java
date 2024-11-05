package com.demo.Bean;

import java.time.LocalDate;

public class Person implements Comparable<Person> {

	 private int pid;
	   private String pname;
	   private String address;
	   private LocalDate bdate;

	   public Person() {
	   }

	   public Person(int pid, String pname, String address) {
	      this.pid = pid;
	      this.pname = pname;
	      this.address = address;
	      this.bdate = bdate;
	   }

	   public int getPid() {
	      return this.pid;
	   }

	   public void setPid(int pid) {
	      this.pid = pid;
	   }

	   public String getPname() {
	      return this.pname;
	   }

	   public void setPname(String pname) {
	      this.pname = pname;
	   }

	   public String getAddress() {
	      return this.address;
	   }

	   public void setAddress(String address) {
	      this.address = address;
	   }

	   public LocalDate getBdate() {
	      return this.bdate;
	   }

	   public void setBdate(LocalDate bdate) {
	      this.bdate = bdate;
	   }

	   public String toString() {
	      return "Person [pid=" + this.pid + ", pname=" + this.pname + ", address=" + this.address + ", bdate=" + this.bdate + "]";
	   }

	@Override
	public int compareTo(Person o) {
		
		return 0;
	}
}
