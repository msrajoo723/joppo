package com.raju.portal.front.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raju.portal.front.controller.service.CompanyService;
import com.raju.portal.front.controller.service.JobNotificationService;
import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.vo.CompanyRequest;

@RestController
@RequestMapping("/v1")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/company/{companyId}")
	public ResponseEntity<Company> getCompany(@PathVariable Long companyId) throws Exception {

		// return ResponseEntity.badRequest().body(". . . . . . get /company ");
		// return ResponseEntity.accepted().body(". . . . . . get /company ");
		// return ResponseEntity.status(HttpStatus.OK).body(". . . . . . get /company
		// ");
		Optional<Company> company = companyService.getCompanyInfo(companyId);
		if (company.isPresent())
			return ResponseEntity.status(HttpStatus.OK).body(company.get());
		else
			return ResponseEntity.status(HttpStatus.OK).body(company.get());
	}

	@GetMapping("/company/all")
	public ResponseEntity<Iterable<Company>> getAllCompanies() {
		Iterable<Company> companieslist = companyService.getCompanies();
		// if(!companieslist.isEmpty())
		return ResponseEntity.status(HttpStatus.OK).body(companieslist);
		// else
		// return ResponseEntity.status(HttpStatus.OK).body(null);
	}

	@PostMapping("/company")
	public ResponseEntity<Company> saveCompany(@RequestBody CompanyRequest companyRequest) {
		return ResponseEntity.ok().body(companyService.saveCompanyDetails(companyRequest));
	}

	@PostMapping("/companies")
	public void saveCompanies(@RequestBody List<Company> companies) {
		System.out.println(". . . . . . post /companies. yet to implement ");
	}

	@PutMapping("/company")
	public ResponseEntity<Company> editCompany(@RequestBody CompanyRequest companyRequest) {
		return ResponseEntity.ok().body(companyService.saveCompanyDetails(companyRequest));
	}

	@DeleteMapping("/company/{companyId}")
	public void deleteCompany(@PathVariable Long companyId) {
		companyService.deleteCompany(companyId);
	}

	@Autowired
	private JobNotificationService jobNotiService;

	@GetMapping("/searchjob/{jobinfoid}")
	public Optional<JobInfo> getJObNoti(@PathVariable("jobinfoid") String jobinfoid) {
		return jobNotiService.getJobNotification((Long.parseLong(jobinfoid)));
	}

	@GetMapping("/page")
	public ResponseEntity<Page<JobInfo>> pagingJobs(
			@RequestParam(defaultValue = "INDIA") String location, 
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "3") int size) {

		//Pageable paging = PageRequest.of(page, size);
		Pageable paging = PageRequest.of(page, size, Direction.ASC, "jobInfoId");				
		Page<JobInfo> joblist = jobNotiService.findByJobName(paging);
		joblist.forEach(System.out::println);
		return ResponseEntity.ok().body(joblist);
	}

	@GetMapping("/job2/{jobid}")
	public JobInfo getJobNotification(@PathVariable String jobid) {
		Optional<JobInfo> jobInfo = null;
		try {
			jobInfo = jobNotiService.getJobNotification(Long.valueOf(jobid));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("exception raised");
		}
		if (jobInfo.isPresent())
			return jobInfo.get();
		else {
			return null;
		}
	}
	/**
	 * 1. SpringBoot is an approach to develope spring based applications with
	 * minimal or less configurations. i.e., AutoConfiguration is one of feature of
	 * SB, 2. It resolves Version Conflicts, 3. Springboot starter poms, 4. Embedded
	 * Server, 5. Embedded DB Support, 6. Actuators.
	 * 
	 */

}