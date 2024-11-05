package com.demo.Service;
import java.util.ArrayList;
import java.util.List;

import com.demo.Bean.Student;
import com.demo.Dao.*;

public class StudServiceImpl implements StudService {

	StudDao stud;

	public StudServiceImpl() {
		super();
		stud = new StudDaoImpl();

	}

	@Override
	public void addStudent(int choice1) {
		
		stud.addStudent(choice1);
		
	}

	@Override
	public void display() {

         stud.display();
		
	}

	@Override
	public List<Student> findStudById(int id) {

		List<Student> list = new ArrayList<>();
		list = stud.findStudById(id);
		return list;
	}
    @Override
	public void deleteStudById(int id1) {
		
	
		 stud.deleteStudById(id1);
		
	}

	@Override
	public List<Student> findByMarks(int marks) {
		
		return stud.findByMarks(marks);
		
	}

	@Override
	public List<Student> sortList(int ch) {
		
		return stud.sortList(ch);
	
	}
	


}
