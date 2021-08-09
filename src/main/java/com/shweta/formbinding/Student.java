package com.shweta.formbinding;

import java.util.List;

import lombok.Data;

@Data
public class Student {

	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	private List<String> timings;
	
}
