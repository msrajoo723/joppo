package com.raju.portal.front.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company implements Serializable {
	
	public Company() {
		super();
	}

	public Company(Long companyId, String companyName, String companyDescription, String companyType, String outsource,
			String level, String workingLocation, String homeLocation, String[] siblings, String[] aliasNames,
			String parentOrganization, String logo, String[] contactPerson, String[] emails, String[] contactNos,
			boolean isPrivate, boolean isPaid, boolean isActive, boolean isBlockList, boolean isRemoved) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyDescription = companyDescription;
		this.companyType = companyType;
		this.outsource = outsource;
		this.level = level;
		this.workingLocation = workingLocation;
		this.homeLocation = homeLocation;
		this.siblings = siblings;
		this.aliasNames = aliasNames;
		this.parentOrganization = parentOrganization;
		this.logo = logo;
		this.contactPerson = contactPerson;
		this.emails = emails;
		this.contactNos = contactNos;
		this.isPrivate = isPrivate;
		this.isPaid = isPaid;
		this.isActive = isActive;
		this.isBlockList = isBlockList;
		this.isRemoved = isRemoved;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "companyid")
	private Long companyId;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "companyDescription")
	private String companyDescription;
	
	@Column(name = "companyType")
	private String companyType;
	
	@Column(name = "outsource")
	private String outsource;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "workingLocation")
	private String workingLocation;
	
	@Column(name = "homeLocation")
	private String homeLocation;
	
	@Column(name = "siblings")
	private String[] siblings;
	
	@Column(name = "aliasNames") 
	private String[] aliasNames;
	
	@Column(name = "parentOrganization")
	private String parentOrganization;
	
	@Column(name = "logo")
	private String logo;
	
	@Column(name="contactPerson")
	private String[] contactPerson;
	
	@Column(name="emails")
	private String[] emails;
	
	@Column(name="contactNos")
	private String[] contactNos;
	
	//flags
	@Column(name="isPrivate")
	private boolean isPrivate;
	
	@Column(name="isPaid")
	private boolean isPaid;
	
	@Column(name="isActive")
	private boolean isActive;
	
	@Column(name="isBlockList")
	private boolean isBlockList;
	
	@Column(name="isRemoved")
	private boolean isRemoved;
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    Set<JobInfo> jobnotifications;

	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL) private
	Set<Payment> payments;
	  
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL) private
	Set<Address> addresses;
	 
	
	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getOutsource() {
		return outsource;
	}

	public void setOutsource(String outsource) {
		this.outsource = outsource;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}

	public String getHomeLocation() {
		return homeLocation;
	}

	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}

	public String[] getSiblings() {
		return siblings;
	}

	public void setSiblings(String[] siblings) {
		this.siblings = siblings;
	}

	public String[] getAliasNames() {
		return aliasNames;
	}

	public void setAliasNames(String[] aliasNames) {
		this.aliasNames = aliasNames;
	}

	public String getParentOrganization() {
		return parentOrganization;
	}

	public void setParentOrganization(String parentOrganization) {
		this.parentOrganization = parentOrganization;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String[] getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String[] contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String[] getEmails() {
		return emails;
	}

	public void setEmails(String[] emails) {
		this.emails = emails;
	}

	public String[] getContactNos() {
		return contactNos;
	}

	public void setContactNos(String[] contactNos) {
		this.contactNos = contactNos;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isBlockList() {
		return isBlockList;
	}

	public void setBlockList(boolean isBlockList) {
		this.isBlockList = isBlockList;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

	public Set<JobInfo> getJobnotifications() {
		return jobnotifications;
	}

	public void setJobnotifications(Set<JobInfo> jobnotifications) {
		this.jobnotifications = jobnotifications;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyDescription="
				+ companyDescription + ", companyType=" + companyType + ", outsource=" + outsource + ", level=" + level
				+ ", workingLocation=" + workingLocation + ", homeLocation=" + homeLocation + ", siblings="
				+ Arrays.toString(siblings) + ", aliasNames=" + Arrays.toString(aliasNames) + ", parentOrganization="
				+ parentOrganization + ", logo=" + logo + ", contactPerson=" + Arrays.toString(contactPerson)
				+ ", emails=" + Arrays.toString(emails) + ", contactNos=" + Arrays.toString(contactNos) + ", isPrivate="
				+ isPrivate + ", isPaid=" + isPaid + ", isActive=" + isActive + ", isBlockList=" + isBlockList
				+ ", isRemoved=" + isRemoved + ", jobnotifications=" + jobnotifications + ", payments=" + payments
				+ ", addresses=" + addresses + "]";
	}


	
	/*
	 * Products: 
	 * Networking Security Hybrid Cloud and IT Solutions Voice and Unified
	 * Communications Managed Services and IT Consulting
	 * 
	 * Solutions:
	 *  Adaptive Networking Connected Security IT Agility
	 * 
	 * Industries:
	 *  Connected Communities Financial Services Gaming Network Healthcare
	 * Manufacturing Media and Entertainment Partners Pharmaceuticals Public Sector
	 * Retail Technology Wholesale
	 * 
	 * Resources:
	 *  Architecture Center Business Support Careers Case Studies Contact
	 * an Expert Events NetNext Blog Network Maps Product Finder Videos & Demos
	 * White Papers
	 */
	
	

}
