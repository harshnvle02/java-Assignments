package com.demo.Bean;

public class SavingAccount extends Account{
	
	private int chqbknum;
	static float intRate;
	static float minBal;
	static {
		intRate=0.04f;
		minBal=5000f;
	}
	public SavingAccount(String accId, String accName, int pin, int bal,String que, String ans, int chqNum) {
		super(accId,accName, pin, bal,que,ans);
		this.chqbknum = chqbknum;
	}
	public SavingAccount() {
		super();
	}
	public int getChqbknum() {
		return chqbknum;
	}
	public void setChqbknum(int chqbknum) {
		this.chqbknum = chqbknum;
	}
	public static float getIntRate() {
		return intRate;
	}
	public static void setIntRate(float intRate) {
		SavingAccount.intRate = intRate;
	}
	public static float getMinBal() {
		return minBal;
	}
	public static void setMinBal(float minBal) {
		SavingAccount.minBal = minBal;
	}
	@Override
	public String toString() {
		return "SavingAccount [chqbknum=" + chqbknum + "]";
	}
	
	public int withdraw(int amt)
	{
		if(balance-amt>=minBal) {
			balance=balance-amt;
			return 1;
		}
		return 2;
		
	}
	

}
