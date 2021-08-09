package com.shweta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="GENDER")
@Data
public class Gender {

	@Id
	@Column(name="GENDER_ID")
	private Integer GenderId;
	
	@Column(name="GENDER_NAME")
	private String GenderName;
	
}
