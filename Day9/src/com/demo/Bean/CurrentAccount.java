package com.demo.Bean;

public class CurrentAccount extends Account {

	private int minTransaction;
	static float intRate;
	static float minBal;
	static {
		intRate=0.04f;
		minBal=5000f;
	}
	
	public CurrentAccount(String accId, String accName, int pin, int bal, String que, String ans, int trans) {
		super(accId,accName,pin,bal,que,ans);
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
	public static float getIntRate() {
		return intRate;
	}
	public static void setIntRate(float intRate) {
		CurrentAccount.intRate = intRate;
	}
	public static float getMinBal() {
		return minBal;
	}
	public static void setMinBal(float minBal) {
		CurrentAccount.minBal = minBal;
	}
	
}
