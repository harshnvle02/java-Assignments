package com.demo.test;
import com.demo.enums.*;

public class TestEnum {

	public static void main(String[] args) {
		
		 Coffee c =  Coffee.big;
		 
		 System.out.println("Display Menu");
		 
		 switch(c) {
		 
		 case small:
			 System.out.println("Small");
			 break;
		 
		 case medium:
			 System.out.println("Medium");
			 break;
			 
		 case big:
			 System.out.println("Big");
			 break;
		 }
	}
}
