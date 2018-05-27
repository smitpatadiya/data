package com.boot.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.vo.StudentRequest;

@Controller
@ComponentScan("com.boot")
public class StudentController {

	@RequestMapping(value = "/" ,method=RequestMethod.GET)
	public String getStudent() {
		System.out.println(":::::::::::::calling getStudent");
		return "addStudent";
	}
	@RequestMapping(value = "/save" ,method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") StudentRequest request) {
		System.out.println(":::::::::::::calling saveStudent" +request);
		return "redirect/:display";
	}
	@RequestMapping(value = "/save" ,method=RequestMethod.POST)
	public String saveStudent1(@ModelAttribute("student") StudentRequest request) {
		System.out.println(":::::::::::::calling saveStudent" +request);
		return "redirect/:display";
	}
	@RequestMapping(value = "/display" ,method=RequestMethod.GET)
	public String displayStudent(Model model) {
		System.out.println(":::::::::::::calling displayStudent");
		//model.addAttribute("students", studentService.findAll());
		return "redirect/:/";
	}
	
}
