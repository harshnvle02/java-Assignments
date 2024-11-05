package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.demo.exception1.WrongNumberInputException;
public class GuessTheNumber {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int number=10;
	    int num;
	    int count = 0;
	    
	    while(true)
	    {
	    	try {
	    		System.out.println("Enter the number");
	    		num=sc.nextInt();
	    		
	    		if(num==number)
	    		{
	    			System.out.println("You won");
	    			System.out.println("total attempt: "+count+1);
	    			break;
	    		}
	    		else
	    		{
	    			throw new WrongNumberInputException("You lost the attempt");
	    			
	    		}
	    		
	    	}catch(WrongNumberInputException e) 
	    	{
	    		System.out.println(e.getMessage());
	    		++count;
	    	}catch(InputMismatchException e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	
	    	
	    }
	}
}
