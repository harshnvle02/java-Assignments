package com.demo.dao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.demo.exception.*;

import com.demo.bean.*;

public class EmployeeDaoServiceImpl implements EmployeeDaoService{

	List<Employee> lst = new ArrayList<>();
	@Override
	public void readFromFile(String filename) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			while(true) {
			   
				Employee e = (Employee)ois.readObject();
				lst.add(e);
				
			}
			
		} catch(EOFException e) {
			
			e.getMessage();
			
		}catch (FileNotFoundException e) {
			
			e.getMessage();
			
		} catch (IOException e) {
			
			e.getMessage();
			
		} catch (ClassNotFoundException e) {
			
			e.getMessage();
		}
	}
	@Override
	public void saveAll(Employee e) {
		 lst.add(e);
		
	}
	@Override
	public boolean deleteStudentById(int id) throws EmployeeNotFound {
		
		boolean flag = lst.remove(new Employee(id));
		
		if(flag) {
			return flag;
		}else {
			throw new EmployeeNotFound("Employee not found");
		}
	}
	@Override
	public boolean updateById(int id1, double sal) throws EmployeeNotFound {
		
		int pos = lst.indexOf(new Employee(id1));
		
		if(pos != -1) {
			Employee e = lst.get(pos);
			e.setSalary(200000);
			return true;
		}
		throw new EmployeeNotFound("Employee Not Found");
	}
	@Override
	public List<Employee> getAll() {
		
		return lst;
	}
	
	@Override
	public void writeFile(String fname) {
	
      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))){
			
			for(Employee e : lst) {
				
				oos.writeObject(e);
			}
      } catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	} catch (IOException e1) {
		
		e1.printStackTrace();
	}
	}

}
