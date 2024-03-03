package com.springbootsms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsms.model.Student;
import com.springbootsms.repository.StudentRepository;
import com.springbootsms.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentrepo;
	
	
	@Override
	public List<Student> getAllStuent() {
		return studentrepo.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentrepo.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentrepo.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentrepo.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentrepo.deleteById(id);
		
	}

}
