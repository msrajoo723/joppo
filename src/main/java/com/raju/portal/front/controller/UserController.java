package com.raju.portal.front.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.portal.front.controller.service.SearchService;
import com.raju.portal.front.entity.JobSeeker;

@RestController
@RequestMapping("/v1")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private SearchService applicationService;

	@GetMapping("/user/{userId}")
	public ResponseEntity<JobSeeker> getJobSeeker(@PathVariable("userId") String userId) {
		logger.debug("Enter intbo SearchController.getResult()");
		logger.debug("Exit from SearchController.getResult()");
		return new ResponseEntity<>(new JobSeeker(), HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<List<JobSeeker>> getUsers() {
		logger.debug("Enter into SearchController.getResult()");
		List<JobSeeker> jobSeekers = new ArrayList<>();
		jobSeekers.add(new JobSeeker());
		logger.debug("Exit from SearchController.getResult()");
		return new ResponseEntity<>(jobSeekers, HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity<String> saveJobSeeker(@RequestBody JobSeeker jobSeekerRequest) {
		logger.debug("Enter into SearchController.getJobSeeker()");

		logger.debug("Exit from SearchController.getJobSeeker()");
		return new ResponseEntity<>("Jod description", HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<String> updateJobSeeker(@RequestBody JobSeeker jobSeekerRequest) {
		logger.debug("Enter into SearchController.getJobSeeker()");

		logger.debug("Exit from SearchController.getJobSeeker()");
		return new ResponseEntity<>("Jod description", HttpStatus.OK);
	}

	@DeleteMapping("/user/{userId}")
	public ResponseEntity<String> deleteJobSeeker(@PathVariable("jobSeekerId") String jobSeekerId) {
		logger.debug("Enter into SearchController.getJobSeeker()");

		logger.debug("Exit from SearchController.getJobSeeker()");
		return new ResponseEntity<>("JobSeeker deleted successfully", HttpStatus.OK);
	}

	@DeleteMapping("/user")
	public ResponseEntity<String> deleteUsers() {
		logger.debug("Enter into SearchController.getJobSeeker()");

		logger.debug("Exit from SearchController.getJobSeeker()");
		return new ResponseEntity<>("All JobSeekers deleted successfully", HttpStatus.OK);
	}
}
