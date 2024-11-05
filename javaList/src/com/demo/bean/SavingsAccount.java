package com.demo.bean;

public class SavingsAccount extends Account{
	
	private int chqbknum;
    static float rate;
    static float minbal;
    
    static {
    	
    	rate = 0.5f;
    	minbal = 10000;
    }
    

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String type, String name, int pin, String que, String ans, double bal, int chqbkno) {
		super(type,name,pin,que,ans,bal);
		this.chqbknum = chqbknum;
	}

	public int getChqbknum() {
		return chqbknum;
	}

	public void setChqbknum(int chqbknum) {
		this.chqbknum = chqbknum;
	}

	public static float getRate() {
		return rate;
	}

	public static void setRate(float rate) {
		SavingsAccount.rate = rate;
	}


	public static float getMinbal() {
		return minbal;
	}

	public static void setMinbal(float minbal) {
		SavingsAccount.minbal = minbal;
	}
	
	@Override
	public String toString() {
		return super.toString()+"]" +"SavingsAccount [chqbknum=" + chqbknum + "]";
	}
    
}
