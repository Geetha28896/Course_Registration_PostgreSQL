package com.sight.CourseRegistrationSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sight.CourseRegistrationSystem.Entity.CourseDetails;
import com.sight.CourseRegistrationSystem.Repository.Coursedetailrepo;

@Service
public class Courseservice {
	
	@Autowired
	private Coursedetailrepo courserepo;
	
	public CourseDetails saveCourseDetails(CourseDetails student) {
		return courserepo.save(student);
	}
	
	public CourseDetails findById(Integer id) {
		return courserepo.findById(id).orElseThrow();
	}
	
	public void deleteById(Integer id) {
		courserepo.deleteById(id);
	}
	
	public List<CourseDetails>findAll(){
		return courserepo.findAll();
		
	}
	

}

	
	
	
	


