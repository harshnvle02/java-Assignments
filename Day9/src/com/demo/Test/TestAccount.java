package com.demo.Test;
import java.util.Scanner;
import com.demo.Service.*;

public class TestAccount {

	public static void main(String[] args) {
	
		AccountService service = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username");
		String uname = sc.next();
		
		System.out.println("Enter password:");
		String pass = sc.next();
		
		LoginService lservice = new LoginServiceImpl();
		String result = lservice.authenticate(uname, pass);
		
		int choice =0;
		if(result.equals("user"))
		{
			
			do {
				System.out.println("1.Add new Account");
				System.out.println("2.Fund Transfer");
				System.out.println("3.Withdraw Money");
				System.out.println("4.Deposite Money");
				System.out.println("5.Close Account");
				System.out.println("6.Change Pin");
				System.out.println("7.Check Balance");
				choice=sc.nextInt();
				
				switch(choice)
				{
				
				case 1->{
					System.out.println("1.Savings");
					System.out.println("1.Current");
				    int ch = sc.nextInt();
				    
				    service.addAccount(ch);
				       
				}
				case 2->{
					
					System.out.println("Enter pin:");
					int pin = sc.nextInt();

					System.out.println("Enter sourceId");
					String sid = sc.next();
					
					System.out.println("Enter Destination id");
					int desid = sc.nextInt();
					
					System.out.println("Enter amount");
					int amt = sc.nextInt();
					
					service.fundTransfer(sid,desid,pin,amt);
				}
				}
			}while(choice != 8);
		}
		
		
	}

}
