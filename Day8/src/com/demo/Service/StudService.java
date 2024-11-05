package com.demo.Service;

import java.util.List;

import com.demo.Bean.Student;

public interface StudService {

	void addStudent(int choice1);

	void display();

	List<Student> findStudById(int id);

	void deleteStudById(int id1);

	List<Student> findByMarks(int marks);

	List<Student> sortList(int ch);

	

}
