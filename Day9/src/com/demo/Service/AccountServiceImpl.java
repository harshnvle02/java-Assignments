package com.demo.Service;

import com.demo.Dao.AccountDao;
import com.demo.Dao.AccountDaoImpl;
import java.util.Scanner;
import com.demo.Bean.*;

public class AccountServiceImpl implements AccountService{

	Scanner sc = new Scanner(System.in);
	private AccountDao dao;
	
	public AccountServiceImpl() {
		super();
		dao = new AccountDaoImpl();
	}



	@Override
	public void addAccount(int ch) {
		
		System.out.println("Account id:");
		String accId = sc.next();
		
		System.out.println("Account Name:");
		String accName = sc.next();
		
	   System.out.println("Enter pin");
	   int pin = sc.nextInt();
	   
	   System.out.println("Enter balance");
	   int bal = sc.nextInt();
	   
	   System.out.println("Enter question");
	   String que = sc.next();
	   
	   System.out.println("Enter ans");
	   String ans = sc.next();
	   
	   if(ch == 1)
	   {
		   System.out.println("Enter cheque book number");
		   int chqNum = sc.nextInt();
		   
		   Account s = new SavingAccount(accId,accName, pin, bal,que,ans,chqNum);
		   dao.addNewAccount(s);
		   
	   }
	   else if(ch == 2)
	   {
		  System.out.println("Enter min transaction");
		  int trans=sc.nextInt();
		 
		  Account s = new CurrentAccount(accId,accName,pin,bal,que,ans,trans);
		  dao.addNewAccount(s);
	   } 
		
	}



	
}
