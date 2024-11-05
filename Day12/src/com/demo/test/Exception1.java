package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
		try {
		System.out.println("enter num1");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		
		int add=num1+num2;
		System.out.println(add);
		int div=num1/num2;
		System.out.println(div);
		break;
		}catch(InputMismatchException e){
			System.out.println("Wrong Input");
			sc.nextLine();
		}catch(ArithmeticException e) {
			
    		//System.out.println(" exception");
			 System.out.println(e.getMessage());
			
		}
//		finally
//		{
//			System.out.println("Yo are in finally");
//		}

	}
 }
}
