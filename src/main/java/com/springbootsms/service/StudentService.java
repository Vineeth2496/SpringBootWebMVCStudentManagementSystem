package com.springbootsms.service;

import java.util.List;

import com.springbootsms.model.Student;

public interface StudentService {
	List<Student> getAllStuent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
