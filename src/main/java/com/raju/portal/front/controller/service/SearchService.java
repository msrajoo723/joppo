package com.raju.portal.front.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.raju.portal.front.controller.repository.CompanyRepository;
import com.raju.portal.front.controller.repository.JobInfoRepository;
import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.vo.SearchRequest;
import com.raju.portal.front.vo.SearchResults;

@Service
public class SearchService {

	private Logger logger = LoggerFactory.getLogger(SearchService.class);

	@Autowired
	private JobInfoRepository jobRepo;
	
	@Autowired
	private CompanyRepository companyRepo;

	@Autowired
	private SearchResults searchResult;

	private Pageable getPageableObj(int page, int size, String _dbprop) {
		return PageRequest.of(page, size, Direction.ASC, _dbprop);
	}

	public Page<JobInfo> searchByLocation(String location, int page, int size) {
		return getResults(getPageableObj(page, size, "location"));
	}

	public Page<JobInfo> searchBySkill(String skill, int page, int size) {
		return getResults(getPageableObj(page, size, "skill"));
	}

	public Page<Company> searchByCompanies(String companyName, int page, int size) {
		Page<Company> obj = null;
		try {
			obj = companyRepo.findAll(getPageableObj(page, size, "companyName"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	public Page<JobInfo> searchByDesignation(String designation, int page, int size) {
		return getResults(getPageableObj(page, size, "designation"));
	}

	public Page<JobInfo> searchByLocAndCompOrDesigOrSkillOrEdu(String location, String searchTerm, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	private Page<JobInfo> getResults(Pageable pageable) {
		Page<JobInfo> obj = null;
		try {
			obj = jobRepo.findAll(pageable);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return obj;
	}

	public Page<JobInfo> searchAllJobs(String location, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<JobInfo> searchWalkIns(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
}
