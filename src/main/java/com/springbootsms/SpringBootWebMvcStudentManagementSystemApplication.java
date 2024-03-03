package com.springbootsms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootsms.model.Student;
import com.springbootsms.repository.StudentRepository;

@SpringBootApplication
public class SpringBootWebMvcStudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcStudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentrepo;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student st1=new Student("Katherine", "Langford", "katherine@gmail.com");
//		studentrepo.save(st1);	
//		
//		Student st2=new Student("Margot", "Robbie", "morgot@gmail.com");
//		studentrepo.save(st2);
//		
//		Student st3=new Student("Gal", "Gadot", "gal@gmail.com");
//		studentrepo.save(st3);
	}
	
	

}
