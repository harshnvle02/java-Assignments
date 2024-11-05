package com.demo.Test;
import com.demo.Service.*;
import java.util.*;
import com.demo.Bean.*;

public class StudTest {

	public static void main(String[] args) {
		
		StudService stud = new StudServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			
			System.out.println("1.Add student in the database");
			System.out.println("2.Display Student");
			System.out.println("3.Find student by id");
			System.out.println("4.Delete student from the database");
			System.out.println("5.Sort student by id");
			System.out.println("6. Search by marks");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("1.Master Student");
				System.out.println("2.Graduate Student");
				int choice1 = sc.nextInt();
				
				stud.addStudent(choice1);
				break;
			case 2 :
				stud.display();
				break;
				
			case 3:
				System.out.println("Enter id :");
				int id = sc.nextInt();
				
				List<Student> list = new ArrayList<>();
				
				list = stud.findStudById(id);
				System.out.println(list);
			    break;
			    
			 case 4 :
				 System.out.println("Enter id :");
					int id1 = sc.nextInt();
					
//					List<Student> list1 = new ArrayList<>();
					 stud.deleteStudById(id1);
				    break;
			 case 5:
				 System.out.println("1.Asending order");
				 System.out.println("1.Descending order");
				 int ch = sc.nextInt();
				 
				 List<Student> lst1 = new ArrayList<>();
				 
				 lst1 = stud.sortList(ch);
				 break;
				 
			 case 6:
				 System.out.println("Enter marks for searching");
				 int marks = sc.nextInt();
				 List<Student> lst = new ArrayList<>();
				 
				 lst = stud.findByMarks(marks);
				 System.out.println(lst);
				 break;
			}
			
		}while(choice != 6);
		
	}
}
