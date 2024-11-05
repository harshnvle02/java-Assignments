package com.demo.test;
import com.demo.service.*;
import java.util.*;
import com.demo.bean.*;

public class AccountTest {

	public static void main(String[] args) {
		
		AccountService service = new AccountServiceImpl();
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter useid");
		String userId = sc.nextLine();
		
		System.out.println("Enter pin");
		String pin =sc.nextLine();
		
		LoginService lservice = new LoginServiceImpl();
		
		String role = lservice.authenticate(userId, pin);
		int choice = 0;
		
		
	    if(role.equals("user"))
	    {
	    	do {
	    	
	    	System.out.println("1.Add new account");
	    	System.out.println("2.Change pin");
	    	System.out.println("3.Deposite money");
	    	System.out.println("4.Withdraw money");
	    	System.out.println("5.Display Account");
	    	System.out.println("6.Transfer Money");
	    	choice = sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1->{
	    		
	    		System.out.println("1.SavingsAccounts");
	    		System.out.println("2.CurrentAccount");
	    		int ch = sc.nextInt();
	    		
	    		service.addAccount(ch);
	    	}
	    	case 2 ->{
	    		
	    		System.out.println("Enter old pin");
	    		int pin1 = sc.nextInt();
	    		
	    		boolean status = service.changePin(pin1);
	    		if(status)
	    		{
	    			System.out.println("Pin Changed Successfully");
	    		}
	    		else {
	    			System.out.println("Old Pin Is Incorrect");
	    		}
	    		
	    	}
	    	case 3 ->{
	    		
	    	}
	    	case 4 ->{
	    		
	    	}
	    	case 5 ->{
	    		
	    		Set<Account> set = new HashSet<>();
	    		set = service.displayList();
	    		System.out.println(set);
	    	}
	    	case 6->{
	    		
	    	}
	    	}
	    	
	    }while(choice != 7);
	    
	   }
	}

}
