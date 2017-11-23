package com.sms.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.student.model.Student;
import com.sms.student.service.StudentService;
/**
 * 
 * @author pundarika
 *
 */
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	/**
	 * <p>Get all students.</p>
	 * @return list of students
	 */
	@GetMapping("/")
	public List<Student> findAllStudents() {
		return studentService.findAll();
	}

	/**
	 * <p>Find one student with the given id.</p>
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Student findOneStudent(@PathVariable("id") Integer id) {
		return studentService.findOne(id);
	}

	/**
	 * <p>saves Student object in databse</p>
	 * @param student
	 * @return
	 */
	@PostMapping("/")
	public Student save(@RequestBody Student student) {

		return studentService.save(student);

	}

	/**
	 * <p>updates existing record in database with the given id</p>
	 * @param student
	 * @param id
	 * @return
	 */
	@PutMapping("/{id}")
	public Student update(@RequestBody Student student, @PathVariable("id") int id) {

		return studentService.update(student, id);

	}

	/**
	 * <p>delete the record with given id</p>
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		studentService.delete(id);
	}

	/**
	 * <p>delete all records</p>
	 */
	@DeleteMapping("/")
	public void deleteAll() {
		studentService.deleteAll();
	}

}
