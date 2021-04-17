package com.raju.portal.front.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raju.portal.front.controller.service.SearchService;
import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.vo.SearchRequest;
import com.raju.portal.front.vo.SearchResults;

@RestController
@RequestMapping("/v1/search")
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private SearchService searchService;
	
	@GetMapping("/bylocation")
	public ResponseEntity<Page<JobInfo>> searchByLocation(
			@RequestParam(defaultValue = "INDIA") String location, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		logger.debug("Enter into SearchController.searchByLocation() ");
		Page<JobInfo> joblist = searchService.searchByLocation(location, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/byskill")
	public ResponseEntity<Page<JobInfo>> searchBySkill(
			@RequestParam(defaultValue = "INDIA") String skill, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<JobInfo> joblist = searchService.searchBySkill(skill, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/bycompanies")
	public ResponseEntity<Page<Company>> searchByCompanies(
			@RequestParam(defaultValue = "INDIA") String location, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<Company> joblist = searchService.searchByCompanies(location, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/bydesignation")
	public ResponseEntity<Page<JobInfo>> searchByDesignation(
			@RequestParam(defaultValue = "INDIA") String location, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<JobInfo> joblist = searchService.searchByDesignation(location, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/multiple")
	public ResponseEntity<Page<JobInfo>> searchByLocAndCompOrDesigOrSkillOrEdu(
			@RequestParam(defaultValue = "INDIA") String location,
			@RequestParam(defaultValue = "") String searchTerm,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<JobInfo> joblist = searchService.searchByLocAndCompOrDesigOrSkillOrEdu(location,searchTerm, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/byalljobs")
	public ResponseEntity<Page<JobInfo>> searchAllJobs(
			@RequestParam(defaultValue = "INDIA") String location, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<JobInfo> joblist = searchService.searchAllJobs(location, page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
	
	@GetMapping("/walkindrive")
	public ResponseEntity<Page<JobInfo>> searchWalkIns(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {
		Page<JobInfo> joblist = searchService.searchWalkIns(page, size);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}
}