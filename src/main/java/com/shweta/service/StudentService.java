package com.shweta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shweta.entity.Course;
import com.shweta.entity.Gender;
import com.shweta.entity.Timing;
import com.shweta.repository.CourseRepo;
import com.shweta.repository.GenderRepo;
import com.shweta.repository.TimingRepo;

@Service
public class StudentService {

	@Autowired
	private GenderRepo gendersRepo;
	
	@Autowired
	private CourseRepo coursesRepo;
	
	@Autowired
	private TimingRepo timingRepo;
	
	public List<String> getGenders(){
		List<Gender> findAll = gendersRepo.findAll();
		
		List<String> genders=new ArrayList<>();
		
		findAll.forEach(gender->{
			genders.add(gender.getGenderName());
		});
		
		return genders;
	}
	
	public List<String> getCourses(){
		List<Course> findAll = coursesRepo.findAll();
		
		List<String> courses=new ArrayList<>();
		courses.add("-select-");
		findAll.forEach(course->{
			courses.add(course.getCourseName());
		});
	
		return courses;
	}
	
	public List<String> getTimings(){
		List<Timing> findAll = timingRepo.findAll();
		
		List<String> timings=new ArrayList<>();
		
		findAll.forEach(timing->{
			timings.add(timing.getTimingName());
		});
		return timings;
	}
}
