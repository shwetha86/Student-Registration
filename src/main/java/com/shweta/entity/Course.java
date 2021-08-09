package com.shweta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="COURSE")
@Data
public class Course {

	@Id
	@Column(name="COURSE_ID")
	private Integer courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;
	
	
}
