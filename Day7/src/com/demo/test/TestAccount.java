package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Account;
import com.demo.services.*;

public class TestAccount {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	AccountService ac = new AccServiceImpl();
	int choice = 0;
	
	do {
		
	System.out.println("1.Add Account");
	System.out.println("2.Delete Account");
	System.out.println("3.Check Balance");
	System.out.println("4.Deposite Money");
	System.out.println("5.Withdraw Money");
	System.out.println("6.Display Account");
	
	choice = sc.nextInt();
	
	switch(choice) {
	
	case 1:
		ac.addAccount();	
		break;
	case 2:
		System.out.println("Account id");
		int id3 = sc.nextInt();
		
		System.out.println("Account pin");
		int pin3 = sc.nextInt();
		
		 ac.deleteAcc(id3, pin3);
		
		break;
	case 3:
		System.out.println("Account id");
		int id = sc.nextInt();
		
		System.out.println("Account pin");
		int pin = sc.nextInt();
		
		ac.checkBalance(id, pin);
		break;
	case 4:
		System.out.println("Account id");
		int id1 = sc.nextInt();
		
		System.out.println("Account pin");
		int pin1 = sc.nextInt();
		
		System.out.println("Enter amount");
		int amt = sc.nextInt();
		
		boolean res = ac.depositMoney(id1, pin1,amt);
		if(res)
		{
			System.out.println("Money added successfully");
		}
		else
		{
			System.out.println("System crash");
		}
		break;
	case 5:
		System.out.println("Account id");
		int id2 = sc.nextInt();
		
		System.out.println("Account pin");
		int pin2 = sc.nextInt();
		
		System.out.println("Enter amount");
		int amt1 = sc.nextInt();
		
		
		boolean ans = ac.withdraw(id2,pin2,amt1);
		if(ans)
		{
			System.out.println("Money has been debited");
		}
		else {
			
			System.out.println("error");
		}
		break;
	case 6:
		Account [] arr = ac.display();
		
		for(Account ac1 : arr)
		{
			if(ac1 != null)
			{
				System.out.println(ac1);
			}
		}
		break;
		
	}
	
	}while (choice != 7);

	}

}
