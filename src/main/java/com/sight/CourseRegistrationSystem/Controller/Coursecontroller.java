package com.sight.CourseRegistrationSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sight.CourseRegistrationSystem.Entity.CourseDetails;
import com.sight.CourseRegistrationSystem.Entity.Studententity;
import com.sight.CourseRegistrationSystem.Service.Courseservice;

@Controller
public class Coursecontroller {
	
	@Autowired
	private Courseservice courseservice;
	
	@RequestMapping("/course")
    public String getCoursedetails(Model model) {
		
		model.addAttribute("courseList",courseservice.findAll());	   
			return "coursetable";
		}
	
	
	 @RequestMapping("/addNewCourse")
		public String addNewCourse(Model model) {
	    CourseDetails course=new CourseDetails();
		model.addAttribute("course",course);	   
			return "addnewcourse";
	    }
	 
	 @RequestMapping("/UpdateCourse/{id}")
	    public String UpdateCourse(@PathVariable("id")Integer id,Model model)
	    {
	    	CourseDetails course=courseservice.findById(id);
	    	model.addAttribute("course",course);
	    	return "updatecoursedetail";
	    }
			
	    @RequestMapping("/deleteCourse/{id}")
	    public String deleteCourse(@PathVariable("id")Integer id)
	    {
	    	courseservice.deleteById(id);	    	
	    	return "redirect:/course";
	    }	
		
	    
	    @PostMapping("/saveCourse")
	    public String saveCourse(CourseDetails course) {
	    	courseservice.saveCourseDetails(course);
	    	return "redirect:/course";
	    }
	    
	    @RequestMapping("/bookNow")
		public String getCourseInfo(Model model) {
		
   		model.addAttribute("courseList",courseservice.findAll());	   
	    			return "coursebooking";
	    		}
	

}
