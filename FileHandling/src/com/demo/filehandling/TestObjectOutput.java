package com.demo.filehandling;

import java.util.List;

import com.demo.bean.Employee;

import java.io.*;

public class TestObjectOutput {

	public static void main(String[] args) {
		
		List<Employee> list = List.of(new Employee(1, "Harsh", 20000.00, 2000),
				new Employee(2, "Himanshi", 100000.00, 10000), new Employee(3, "Om", 200000.00, 20000));
		
		writeFile(list);
		
		System.out.println("Reading the fileof data");
		
		readFile(list);
	}

	private static void readFile(List<Employee> list) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.dat"))){
			
			while(true) {
				
				Employee e = (Employee)ois.readObject();
				System.out.println(e);
			}
			
		} catch (FileNotFoundException e) {			
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
	}

	private static void writeFile(List<Employee> list) {
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.dat"))){
			
			for(Employee e : list)
			{
				oos.writeObject(e);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
