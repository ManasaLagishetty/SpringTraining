package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;


@Service
public class StudentService {
	
	
   ArrayList<Student> student=new ArrayList<>(Arrays.asList(new Student(1,"Manasa","Lagishetty",35),
		                                                        new Student(2,"Sravani","Kolagani",65)));
	 
	//Student std1=new Student(1,"Manasa","Lagishetty",35);
	//Student std2=new Student(2,"Sravani","Kolagani",65);
	
	//student.add(new Student(1,"Manasa","Lagishetty",35));
	//student.add(std2);

	
	public List<Student> getStudents(){
			return student;	
	}

	public Student getStudentById(Integer id) {
		return student.get(id);
	}

	public void saveDetails(Student std) {
		std.setId(student.size()+1);
	     student.add(std);
		
	}

	public void deleteStudentById(Integer id) {
		System.out.println(student.size());
	      student.remove(id);
	      System.out.println(student.size());
		
	}

	public void updateStudentDetails(Integer id, Student std) {
		 std.setId(id);
		 student.add(id , std);
		
	}

}
