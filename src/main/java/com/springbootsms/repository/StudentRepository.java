package com.springbootsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootsms.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
