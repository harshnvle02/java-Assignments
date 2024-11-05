package com.demo.beans;

public class Account {

	
	private int accid;
	private String acName;
	private double balance;
	private long pin;
	
	public Account() {
		super();
	}
	
	public Account(int accid, String acName, double balance, long pin) {
		super();
		this.accid = accid;
		this.acName = acName;
		this.balance = balance;
		this.pin = pin;
	}

	
	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", acName=" + acName + ", balance=" + balance + ", pin=" + pin + "]";
	}

	public void deposite(int amt) {
		this.balance = this.balance + amt;
		
		
	}

	public void withdraw(int amt) {
		
		if(this.balance - amt >= 10000)
		{
			this.balance = this.balance - amt;
		}
		
	}


	
}
