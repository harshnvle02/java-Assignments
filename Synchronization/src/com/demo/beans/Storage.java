package com.demo.beans;

public class Storage {

	public int n;
	public boolean valueset = false;
	
	public Storage(){
	}
	
	synchronized public void put(int num) {
		if(this.valueset) {
			
//			try {
//				this.wait();
//			}catch(InterruptedException e) {
//				e.getMessage();
//			}
			
		}
		this.n = num;
		System.out.println("In put" +num);
		this.valueset = true;
		this.notify();
	}
	synchronized public void get(int num) {
	   
		if(!this.valueset) {
//			
//			try {
//				this.wait();
//			}catch(InterruptedException e) {
//				e.getMessage();
//			}
		}
		System.out.println("in get" +this.n);
		this.valueset = false;
		this.notify();
	}

	
}
