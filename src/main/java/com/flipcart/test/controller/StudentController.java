package com.flipcart.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipcart.test.model.Student;
import com.flipcart.test.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getstudent")
	public String getStudentName() {
		return "Kundan";
	}
	@GetMapping("getroll")
	public int getStudentRollNumber() {
		return 007;
	}
	@GetMapping("/getallstudentdetails")
	public List<Student> getAllStudentDetails(){
		return studentService.getStudent();
	}
	
	@PostMapping("/savestudents")
	public String saveStudentsDetails(@RequestBody Student student) {
		System.out.println(student);
		studentService.saveStudents(student);
		return "Success";
		
	}
	
	@GetMapping("/getallstudentdetails/{id}")
	public Student getStudentById(@PathVariable("id") Integer id) {
		System.out.println(id);
		return studentService.getStudentById(id);
		
	}
	@DeleteMapping("/removestudentbyid/{id}")
	public String deleteStudentById(@PathVariable("id") Integer id) {
		return studentService.removeStudentById(id);
	}
	
	@GetMapping("/getstudentdetails/{id}")
	public String getStudentByIdAndName(@PathVariable("id") Integer id, @RequestParam String name) {
		System.out.println(id+" "+name);
		return studentService.getStudentByIdAndName(id, name);
		
	}
}
