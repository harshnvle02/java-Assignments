package com.demo.bean;

public class CurrentAccount extends Account{

	private int minTransaction;
	static float rate;
	static float minBal;
	
	static {
	    
		rate = 0.3f;
		minBal = 20000;
	}

	public CurrentAccount(String type, String name, int pin, String que, String ans, double bal, int minTransaction) {
		super(type,name,pin,que,ans,bal);
		this.minTransaction = minTransaction;
	}

	public CurrentAccount() {
		super();
	}

	public int getMinTransaction() {
		return minTransaction;
	}

	public void setMinTransaction(int minTransaction) {
		this.minTransaction = minTransaction;
	}

	public static float getRate() {
		return rate;
	}

	public static void setRate(float rate) {
		CurrentAccount.rate = rate;
	}

	public static float getMinBal() {
		return minBal;
	}

	public static void setMinBal(float minBal) {
		CurrentAccount.minBal = minBal;
	}

	@Override
	public String toString() {
		
		return super.toString()+"]"+"CurrentAccount [minTransaction=" + minTransaction + "]";
	}
	
}
