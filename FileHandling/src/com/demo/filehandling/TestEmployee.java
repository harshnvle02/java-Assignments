package com.demo.filehandling;
import java.util.*;
import com.demo.bean.*;

import com.demo.exception.EmployeeNotFound;
import com.demo.service.*;


public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice = 0;
		
		EmployeeService service = new EmployeeServiceImpl();
		
		service.readFile("empdata.dat");
		
		do{
			
			System.out.println("1.Add new Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Display All");
			choice = sc.nextInt();
			
			switch(choice) {
			
				case 1->{
					service.addNewEmployee();
				}
				case 2->{
					try {
						
						System.out.println("Enter id");
						int id = sc.nextInt();
						
						boolean status = service.deleteStudentId(id);
						if(status) {
							System.out.println("Deleted Successfully");
						}
					}catch(EmployeeNotFound e) {
						e.getMessage();
					}
				}
				case 3->{
					
                    try {
						System.out.println("Enter id");
						int id1 = sc.nextInt();
						
						System.out.println("Enter salary");
						double sal = sc.nextDouble();
						
						boolean status = service.updateStudentById(id1, sal);
						if(status) {
							System.out.println("Updated Successfully");
						}
					}catch(EmployeeNotFound e) {
						e.getMessage();
					}
				}
				case 4->{
					
					List<Employee> elist = new ArrayList<>();
					elist = service.display();
					elist.stream().forEach(System.out::println);
				}
				case 5->{
					
					service.witeFile("empdata.dat");
				}
			}
			
		}while(choice != 5);

	}

}
