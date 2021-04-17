package com.raju.portal.front.vo;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JobRequest {
	private String id;
	private String jobName;
	private String jobSkills;
	private String experience;
	private String salary;
	private String postedBy;
	private Date postedDate;
	private String jobLaction;
	private String interviewLocation;
}
