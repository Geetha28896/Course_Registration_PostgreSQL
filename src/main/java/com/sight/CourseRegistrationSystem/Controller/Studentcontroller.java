package com.sight.CourseRegistrationSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sight.CourseRegistrationSystem.Entity.Studententity;
import com.sight.CourseRegistrationSystem.Service.Studentservice;


@Controller
public class Studentcontroller {
	
	@Autowired
	 private Studentservice studentservice;
	
	    @RequestMapping("/")
		public String getHome(Model model) {
		
		model.addAttribute("studentList",studentservice.findAll());	   
			return "studentindex";
		}
	    
	    
	    @RequestMapping("/addNewStudent")
		public String addNewStudent(Model model) {
	    Studententity student=new Studententity();
		model.addAttribute("student",student);	   
			return "student";
	    }
			
	    @RequestMapping("/showUpdate/{id}")
	    public String showUpdate(@PathVariable("id")Integer id,Model model)
	    {
	    	Studententity student=studentservice.findById(id);
	    	model.addAttribute("student",student);
	    	return "updatestudent";
	    }
			
	    @RequestMapping("/deleteStudent/{id}")
	    public String deleteStudent(@PathVariable("id")Integer id)
	    {
	    	studentservice.deleteById(id);	    	
	    	return "redirect:/";
	    }	
		
	    
	    @PostMapping("/saveStudent")
	    public String saveStudent(Studententity student) {
	    	studentservice.saveStudententity(student);	
	    	return "statement";
	    }
	    
	    
	    
	   
	
	
	}