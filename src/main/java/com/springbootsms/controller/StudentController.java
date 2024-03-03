package com.springbootsms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootsms.model.Student;
import com.springbootsms.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	
	//Handler method to  handle list students and return model and view
	@GetMapping("/students")
	public String listofstudents(Model model) {
		List<Student> list=studentservice.getAllStuent();
		model.addAttribute("students", list);
		return "students";
	}
	@GetMapping("/student/new")
	public String createStudentForm(Model model) {
		
		//Create Student Object to hold student form data
		Student st=new Student();
		model.addAttribute("student", st);

		return "create_student";
	} 
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentservice.saveStudent(student);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentservice.getStudentById(id));
		return "edit_student";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		// get Student from database by id
		Student existingStudent=studentservice.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentservice.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	//handler method to handle delete student request
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentservice.deleteStudentById(id);
		return "redirect:/students";
	}
	
}
