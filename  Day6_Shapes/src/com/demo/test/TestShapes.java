package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Circle;
import com.demo.beans.Rectangle;
import com.demo.beans.Shapes;
import com.demo.beans.Triangle;
import com.demo.service.ShapeService;

public class TestShapes {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice=0;
//		function calling for accept data
		for(int i=0;i<3;i++)
		{
			System.out.println("1. Triangle\n2 Circle\n3. Rectangle\n choice: ");
			choice=sc.nextInt();
			ShapeService.acceptData(choice);
		}
		
//		function calling for calculation
		for(int i=0;i<3;i++) {
			ShapeService.calculateAreaPara(i);
		}
		 
		Shapes[] arr= ShapeService.getAllShapes();
		
		int cntTri=0;
		int cntCir=0;
		int cntRec=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] instanceof Triangle)
			{
				cntTri++;
			}
			else if(arr[i] instanceof Circle)
			{
				cntCir++;
			}
			else if(arr[i] instanceof Rectangle)
			{
				cntRec++;
			}
		}
		System.out.println("Triangle Count: "+cntTri);
		
		System.out.println("Circle Count: "+cntCir);
		System.out.println("Rectangle Count: "+cntRec);
	}
}
