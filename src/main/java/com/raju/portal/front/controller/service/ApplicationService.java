package com.raju.portal.front.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raju.portal.front.pojo.Company;
import com.raju.portal.front.pojo.Job;
import com.raju.portal.front.vo.SearchRequest;
import com.raju.portal.front.vo.SearchResults;

@Service
public class ApplicationService {

	private Logger logger = LoggerFactory.getLogger(ApplicationService.class);

	@Autowired
	SearchResults searchResult;

	public List<SearchResults> getResults() {
		logger.debug("This is Service.");
		Company company = new Company();
		company.setActive(Boolean.TRUE);
		company.setCompnyName("Sapient");
		Job job = new Job();
		job.setJobName("JUJU");
		job.setInterviewType("Telephonic");

		searchResult.setCompany(company);
		searchResult.setJob(job);

		ArrayList<SearchResults> jobList = new ArrayList<>();
		jobList.add(searchResult);
		return jobList;
	}

	public SearchResults getResults(SearchRequest searchRequest) {
		logger.debug("This is Service.");
		searchRequest.setSkills("java");
		searchRequest.setLocation("Bangalore");
		searchRequest.setExperience("6 years");
		searchRequest.setSalary("10 lacs");
		return new SearchResults();
	}
}
