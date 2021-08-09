package com.shweta.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TIMINGS")
@Data
public class Timing {

	@Id
	@Column(name="TIMING_ID")
	private Integer timingId;
	
	@Column(name="TIMING_NAME")
	private String timingName;
}
