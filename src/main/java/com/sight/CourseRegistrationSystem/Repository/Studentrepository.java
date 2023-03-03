package com.sight.CourseRegistrationSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sight.CourseRegistrationSystem.Entity.Studententity;

public interface Studentrepository extends JpaRepository<Studententity,Integer>{

}
