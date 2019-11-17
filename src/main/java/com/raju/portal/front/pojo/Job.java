package com.raju.portal.front.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	private String jobName;
	private String jobDescription;
	private String jobSkills;
	private String experience;
	private String salary;
	private String interview;
	private String aliveDays;
	//Scheduler will update
	private String isActive;
	private String reference;
	private List<String> contactPerson;
	private String postedBy;
	private Date postedDate;
	private Date jobActiveDate;
	private Date jobDeactiveDate;
	private boolean show;
	private Recruiter recruiterDetails;
	//vacance company
	private String jobForcomany;
	private String jobLaction;
	private String interviewLocation;
	private String interviewType;

}
