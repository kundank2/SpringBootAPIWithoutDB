package com.flipcart.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.flipcart.test.model.Student;

@Service
public class StudentService {
	List<Student> listOfStudents = new ArrayList<>();

	public List<Student> getStudent() {
		return listOfStudents;
	}

	public void saveStudents(Student student) {
		listOfStudents.add(student);
	}
	
	public Student getStudentById(Integer id) {
		Student result=null;
		for(Student student: listOfStudents) {
			if(student.getId().equals(id)) {
				result=student;
			}
		}
		return result;
	}
	public String removeStudentById(Integer id) {
		Student tempStudent=null;
		for(Student student2 : listOfStudents) {
			if(student2.getId().equals(id)) {
				tempStudent=student2;
			}
		}
		listOfStudents.remove(tempStudent);
		return "Successfully removed Student with id:- " + id;
	}
	
	public String getStudentByIdAndName(Integer id, String name) {
		for(Student student: listOfStudents) {
			if(student.getId().equals(id) && (student.getFirstName().toUpperCase().contains(name.toUpperCase()))) {
				return "Dat is avaiable:"+student;
			}
		}
		return "Data Not Founds";
	}
}
