package com.demo.Dao;
import com.demo.Bean.GraduateStudent;
import com.demo.Bean.MasterStudent;
import com.demo.Bean.Student;
import com.demo.Test.*;

import java.util.*;

public class StudDaoImpl implements StudDao {
    
	Scanner sc = new Scanner(System.in);
	
	List<Student> list = new ArrayList<>();
	@Override
	public void addStudent(int choice1) {
		
		System.out.println("Enter student id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter student name");
		String name = sc.nextLine();
		
		System.out.println("Enter student address");
		String address = sc.nextLine();
		
		System.out.println("Enter student marks m1");
		int m1 = sc.nextInt();
		
		System.out.println("Enter student marks m2");
		int m2 = sc.nextInt();
		sc.nextLine();
		if(choice1 == 1)
		{
			System.out.println("Enter thesis subject");
			String thesisSub = sc.nextLine();
			
			System.out.println("Enter graduation degree");
			String degree = sc.nextLine();
			
			System.out.println("Enter thesis marks");
			int thesisMarks  = sc.nextInt();
			
			list.add(new MasterStudent(id,name,address,m1,m2,thesisSub, degree, thesisMarks));
		}
		else if(choice1 == 2)
		{
			System.out.println("Enter special subjects marks");
			int specSub = sc.nextInt();
			
			list.add(new GraduateStudent(id,name,address,m1,m2,specSub));
			
	
		}
	}
	@Override
	public void display() {
		
		System.out.println(list);
		
	}

	@Override
	public List<Student> findStudById(int id) {
		
		List<Student> newList = new ArrayList<>();
		for(Student student : list) {
			
			if(student.getStudId() == id)
			{
				
			   newList.add(student);
			  
			}
		}
		return newList;
		
	}
	@Override
	public void deleteStudById(int id1) {
		
		 Iterator<Student> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Student student = iterator.next();
	            if (student.getStudId() == id1) {
	                iterator.remove(); 
	            }
	        }
	
	}
	@Override
	public List<Student> findByMarks(int marks) {
		
		List<Student> newList = new ArrayList<>();
		
		for(Student student : list)
		{
			if(student instanceof MasterStudent)
			{
				if(((MasterStudent)student).getM1() > marks)
				{
					newList.add(student);
				}
			}
			else if(student instanceof GraduateStudent)
			{
				if(((GraduateStudent)student).getM1() > marks){
					
					newList.add(student);
				}
			}
		}
		return newList;
	}
	@Override
	public List<Student> sortList(int ch) {
		
		List<Student> lst1 = new ArrayList<>();
		
		for(Student s :list)
		{
			lst1.add(s);
		}
		lst1.sort(null);
		return lst1;
	}
	

}
