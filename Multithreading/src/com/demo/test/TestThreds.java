package com.demo.test;
import com.demo.beans.*;
import java.util.Scanner;

public class TestThreds {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		MyClass obj = new MyClass();
		
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		obj.printTable(num);
		
		int fact = obj.factorial(5);
		System.out.println("Factorial is: "+fact);
	}
}
