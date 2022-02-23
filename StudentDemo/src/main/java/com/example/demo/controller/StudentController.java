package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllEmployees(){
		return  studentService.getStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student std,@RequestHeader(value="Accept") String acceptHeader) {
		
		studentService.saveDetails(std);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(acceptHeader);
	}
	
   @DeleteMapping("/delete/{id}")
   public String deleteStudent(@PathVariable Integer id) {
	   studentService.deleteStudentById(id);
	   return "the id " + id + "deleted";
   }
   
   @PutMapping("/update/{id}")
   public void updateStudent(@PathVariable Integer id , @RequestBody Student std) {
	   studentService.updateStudentDetails(id,std);
	   
   }
   

}
