package com.demo.beans;

public class MyClass {

	public MyClass() {
		
	}
	public void printTable(int n) {
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("" +n+ "*" +i+ "" +n*i);		
		}
		try {
			
			Thread.sleep(300);
			
		}catch(InterruptedException e){
			e.getMessage();
			
		}
		
	}
	
	public int factorial(int num)
	{
		int fact = 1;	
		for(int i = 1; i <= num; i++) {
			
			fact = fact*i;
		}
        try {
			
			Thread.sleep(5000);
			
		}catch(InterruptedException e){
			e.getMessage();
			
		}
		
		return fact;
	}
}
