package com.shweta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shweta.formbinding.Student;
import com.shweta.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/loadForm")
	public String loadRegForm(Model model) {
		
		model.addAttribute("genders", studentservice.getGenders());
		model.addAttribute("courses", studentservice.getCourses());
		model.addAttribute("timings", studentservice.getTimings());
		
		Student sobj=new Student();
		
		model.addAttribute("student", sobj);
		
		return "index";
	}
	
	@PostMapping("/saveForm")
	public String saveForm(Student student,Model model) {
		
		System.out.println(student);
		
		model.addAttribute("msg", "Student Registered Successfully...!!!");
		
		return "dashboard";
		
	}
	
	
}
