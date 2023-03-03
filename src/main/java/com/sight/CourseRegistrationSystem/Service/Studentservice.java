package com.sight.CourseRegistrationSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sight.CourseRegistrationSystem.Entity.Studententity;
import com.sight.CourseRegistrationSystem.Repository.Studentrepository;

@Service
public class Studentservice {
	
	@Autowired
	private Studentrepository studentrepo;
	
	public Studententity saveStudententity(Studententity student) {
		return studentrepo.save(student);
	}
	
	public Studententity findById(Integer id) {
		return studentrepo.findById(id).orElseThrow();
	}
	
	public void deleteById(Integer id) {
		studentrepo.deleteById(id);
	}
	
	public List<Studententity>findAll(){
		return studentrepo.findAll();
		
	}
	

}
