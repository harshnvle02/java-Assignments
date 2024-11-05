package com.demo.bean;

public class Account {

    static int cnt;
    static {
    	cnt = 0;
    }
	private String id;
	private String name;
	private int pin;
	private String type;
	private double bal;
	private String que;
	private String ans;
	
	public Account() {
		super();
		this.id = generateId(type, name);
	}

	public Account(String type, String name, int pin,  String que, String ans,double bal) {
		super();
		this.id = generateId(type, name);
		this.name = name;
		this.pin = pin;
		this.bal = bal;
		this.que = que;
		this.ans = ans;
	}

	private String generateId(String type2, String name2) {
		
		if(name != null)
		{
			++cnt;
			return type2+name2.substring(0,2)+cnt;
			
		}
		else {
			
			++cnt;
			return "xxx"+cnt;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", pin=" + pin + ", bal=" + bal + ", que=" + que + ", "
				+ "ans=" + ans + "]";
	}
	
	
	
}
