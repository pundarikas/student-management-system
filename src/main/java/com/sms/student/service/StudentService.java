package com.sms.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.student.model.Student;
import com.sms.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student save(Student student) {
		return studentRepository.save(student);
		
	}
	
	public Student update(Student student) {
		return this.studentRepository.save(student);
		
	}

	public List<Student> findAll() {
		return this.studentRepository.findAll();
		
	}
	
	public Student findOne(int id) {
		return this.studentRepository.findOne(id);
		
	}
	
	public void delete(int id) {
		this.studentRepository.delete(id);
		
	}
	
	public void deleteAll() {
		this.studentRepository.deleteAll();
		
	}

}
