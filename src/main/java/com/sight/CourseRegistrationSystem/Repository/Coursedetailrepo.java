package com.sight.CourseRegistrationSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sight.CourseRegistrationSystem.Entity.CourseDetails;

public interface Coursedetailrepo extends JpaRepository<CourseDetails, Integer> {
	
	

}
