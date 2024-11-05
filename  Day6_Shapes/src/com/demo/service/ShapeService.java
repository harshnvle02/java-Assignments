package com.demo.service;
import java.util.Scanner;
//import bean classes
import com.demo.beans.Shapes;
import com.demo.beans.Circle;
import com.demo.beans.Triangle;
import com.demo.beans.Rectangle;


public class ShapeService {
//	declaration of static data members
	static Shapes[] arr;
	static int cnt;
	
//	initialization of static data members
	static
	{
		arr=new Shapes[4];
		cnt=0;
	}
//  accept data
	public static void acceptData(int choice) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter shape color: ");
		String color=sc.next();
		
		switch(choice)
		{
//		for triangle
		case 1: 
			System.out.println("Enter Base: ");
			float b=sc.nextFloat();
			System.out.println("Enter Height: ");
			float h=sc.nextFloat();
			System.out.println("Enter Side1: ");
			float s1=sc.nextFloat();
			System.out.println("Enter Side2: ");
			float s2=sc.nextFloat();	
//          object creation for Triangle
			arr[cnt]=new Triangle(color,b,h,s1,s2);
		break;
		
//		for circle
		case 2:
			System.out.println("Enter Radius: ");
			float r=sc.nextFloat();
//			object creation for Circle
			arr[cnt]=new Circle(color,r);
		break;
		
//		for rectangle
		case 3:
			System.out.println("Enter Length: ");
			float l=sc.nextFloat();
			System.out.println("Enter Breadth: ");
			float bre=sc.nextFloat();
//			object creation for rectangle
			arr[cnt]=new Rectangle(color,l,bre);
		break;	
		
		default:
			System.out.println("Not a shape..");
	    }
		cnt++;
	}
	
//	calculate area and parameter and display
	public static void calculateAreaPara(int i) {
		System.out.println(i+" : Area "+ arr[i].area());
		System.out.println(i+" : Parameter "+arr[i].para());	
	}
//count of shapes
	public static Shapes[] getAllShapes() {
		
		return arr;
	}


	



	
	
}
