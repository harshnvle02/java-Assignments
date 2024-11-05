package com.demo.Bean;

public abstract class Account {
	
	private String accid;
	private String acname;
	private int acpin;
	protected int balance;
	private String question;
	private String ans;
	
	public Account() {
		super();
	}
	
	public Account(String accid, String acname, int acpin, int balance, String question, String ans) {
		super();
		this.accid = accid;
		this.acname = acname;
		this.acpin = acpin;
		this.balance = balance;
		this.question = question;
		this.ans = ans;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public int getAcpin() {
		return acpin;
	}

	public void setAcpin(int acpin) {
		this.acpin = acpin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Account [accid=" + accid + ", acname=" + acname + ", acpin=" + acpin + ", balance=" + balance
				+ ", question=" + question + ", ans=" + ans + "]";
	}

	 abstract public int withdraw(int amt);

	public void deposit(int amt) {
        
		balance = balance + amt;
		
	}
	
	

}
