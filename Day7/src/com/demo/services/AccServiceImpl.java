package com.demo.services;
import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.Account;

public class AccServiceImpl implements AccountService {
     
	static Account[] accarr;
	static int cnt = 0;
	
	static {
		
		accarr = new Account[10];
	}
	
	@Override
	public void addAccount() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder name");
		String name = sc.nextLine();
		System.out.println("Enter account balance");
		double bal = sc.nextDouble();
		System.out.println("Enter account pin");
	    long pin = sc.nextLong();
	    
	    accarr[cnt] = new Account(id,name,bal,pin); 
	    cnt++;
		
	}

	@Override
	public Account[] display() {
		
        return accarr;
		
	}



	@Override
	public void checkBalance(int id, int pin) {
		
		int pos = findPosition(id,pin);
		if(pos >= 0)
		{
			System.out.println(accarr[pos].getBalance());
		}else if(pos == -1) {
			System.out.println("invalid credentials");
		}
		
	}

	private int findPosition(int id, int pin) {
		
		for(int  i = 0; i < accarr.length; i++)
		{
			if(accarr[i].getAccid() == id)
			{
				if(accarr[i].getPin() == pin)
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean depositMoney(int id, int pin, int amt) {
		
		int pos = findPosition(id,pin);
		
		if(pos >= 0)
		{
			accarr[pos].deposite(amt); 
			return true;
			
		}
		return false;
		
		
	}

	@Override
	public boolean withdraw(int id, int pin, int amt) {
		
		int pos = findPosition(id, pin);
		
		if(pos >= 0)
		{
			accarr[pos].withdraw(amt);
			return true;
		}
		return false;
		
		
	}

	@Override
	public void deleteAcc(int id3, int pin3) {
		
		int pos = findPosition(id3, pin3);
		
		for(int  i = pos; i < accarr.length; i++)
		{
			accarr[pos] = accarr[pos + 1];
		
		}
		
		
	}

}
