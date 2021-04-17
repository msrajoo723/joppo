package com.raju.portal.front.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "jobinfo")
public class JobInfo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "jobInfoId")
	private Long jobInfoId;
	private String jobName;	
	private String jobDescription;
	private String jobSkills;
	private String experience;
	private String salary;
	private String interview;
	private String aliveDays;
	// Scheduler will update
	private String isActive;
	private String reference;
	private String contactPerson;
	private String postedBy;
	private Date postedDate;
	private Date jobActiveDate;
	private Date jobDeactiveDate;
	private boolean publish;
	//private Recruiter recruiterDetails;
	private String location;
	private String interviewLocation;
	private String interviewType;

	
	@ManyToOne
	@JoinColumn(name = "companyid")
	@JsonIgnore
    private Company company;

	public JobInfo(){
		
	}

	public JobInfo(Long jobInfoId, String jobName, String contactPerson, String interviewLocation,
			String interviewType) {
		super();
		this.jobInfoId = jobInfoId;
		this.jobName = jobName;
		this.contactPerson = contactPerson;
		this.interviewLocation = interviewLocation;
		this.interviewType = interviewType;
	}

	public Long getJobInfoId() {
		return jobInfoId;
	}

	public void setJobInfoId(Long jobInfoId) {
		this.jobInfoId = jobInfoId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobSkills() {
		return jobSkills;
	}

	public void setJobSkills(String jobSkills) {
		this.jobSkills = jobSkills;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getInterview() {
		return interview;
	}

	public void setInterview(String interview) {
		this.interview = interview;
	}

	public String getAliveDays() {
		return aliveDays;
	}

	public void setAliveDays(String aliveDays) {
		this.aliveDays = aliveDays;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public Date getJobActiveDate() {
		return jobActiveDate;
	}

	public void setJobActiveDate(Date jobActiveDate) {
		this.jobActiveDate = jobActiveDate;
	}

	public Date getJobDeactiveDate() {
		return jobDeactiveDate;
	}

	public void setJobDeactiveDate(Date jobDeactiveDate) {
		this.jobDeactiveDate = jobDeactiveDate;
	}

	public boolean isPublish() {
		return publish;
	}

	public void setPublish(boolean publish) {
		this.publish = publish;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInterviewLocation() {
		return interviewLocation;
	}

	public void setInterviewLocation(String interviewLocation) {
		this.interviewLocation = interviewLocation;
	}

	public String getInterviewType() {
		return interviewType;
	}

	public void setInterviewType(String interviewType) {
		this.interviewType = interviewType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
