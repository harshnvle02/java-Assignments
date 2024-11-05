package com.demo.Dao;

import java.util.List;

import com.demo.Bean.Student;

public interface StudDao {

	void addStudent(int choice1);

	void display();

	List<Student> findStudById(int id);

	void deleteStudById(int id1);

	List<Student> findByMarks(int marks);

	List<Student> sortList(int ch);

	

}
