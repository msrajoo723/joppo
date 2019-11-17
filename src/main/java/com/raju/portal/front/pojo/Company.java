package com.raju.portal.front.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Company {
	private String compnyName;
	private String companyDescription;
	private String companyType;
	private String outsource;
	private String level;
	private String workingLocation;
	private String homeLocation;
	private List<String> siblings;
	private List<String> aliasNames;
	private String parentOrganization;
	private String logo;
	
	//contacts
	private List<String> contactPerson;
	private Address address;
	private List<String> emails;
	private List<String> contactNos;
	
	//flags
	private boolean isPrivate;
	private boolean isPaid;
	private boolean isActive;
	private boolean isBlockList;
	private boolean isRemoved;

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
