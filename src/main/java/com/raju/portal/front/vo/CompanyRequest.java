package com.raju.portal.front.vo;

import java.util.Set;

import com.raju.portal.front.entity.Address;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.entity.Payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRequest {

	private Long id;
	private String companyName;
	private String companyDescription;
	private String companyType;
	private String outsource;
	private String level;
	private String workingLocation;
	private String homeLocation;
	private String[] siblings;
	private String[] aliasNames;
	private String parentOrganization;
	private String logo;
	
	// contacts
	private String[] contactPerson;
	private String[] emails;
	private String[] contactNos;

	// flags
	private boolean isPrivate;
	private boolean isPaid;
	private boolean isActive;
	private boolean isBlockList;
	private boolean isRemoved;
	
	private Set<JobInfo> jobnotifications;
	private Set<Address> addresses;
	private Set<Payment> payments;
}
