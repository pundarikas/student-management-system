package com.sms.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

		
}
