package com.shweta.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shweta.entity.Course;

public interface CourseRepo extends JpaRepository<Course,Serializable>{

}
