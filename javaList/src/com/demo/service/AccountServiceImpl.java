package com.demo.service;
import com.demo.dao.*;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.*;

public class AccountServiceImpl implements AccountService {

	AccountDao dao;
	Scanner sc = new Scanner(System.in);

	public AccountServiceImpl() {
		super();
		dao = new AccountDaoImpl();
	}

	@Override
	public void addAccount(int ch) {
		 
		System.out.println("Enter Account Name");
		String name = sc.nextLine();
		
		System.out.println("Enter 4 digit pin");
		int pin = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter question");
		String que = sc.nextLine();
		
		System.out.println("Enter ans");
		String ans =sc.nextLine();
		
		System.out.println("Enter amount to be deposited");
		double bal = sc.nextDouble();
		
		if(ch == 1)
		{
			System.out.println("Enter cheque book number");
			int chqbkno =sc.nextInt();
			
			Account s = new SavingsAccount("s",name,pin,que,ans,bal,chqbkno);
			
			dao.addAccount(s);
		}
		else if(ch == 2)
		{
			System.out.println("Enter Minimum Transaction Amount");
			int minTrans = sc.nextInt();
			
			Account s1 = new CurrentAccount("c",name,pin,que,ans,bal,minTrans);
			dao.addAccount(s1);
			}
	}

	@Override
	public boolean changePin(int pin1) {
		
		Account ac = dao.findAccount(pin1);
		
		if(ac != null)
		{
			System.out.println("Enter new pin");
			int pin = sc.nextInt();
			
			ac.setPin(pin);
			return true;
		}
		else {
			return false;
		}
	
		 
	}

	@Override
	public Set<Account> displayList() {
		
		return dao.displayList();
	}
	
	

}
