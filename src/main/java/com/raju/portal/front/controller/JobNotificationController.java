package com.raju.portal.front.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.portal.front.controller.service.JobNotificationService;
import com.raju.portal.front.entity.JobInfo;

@RestController
@RequestMapping("/v2")
public class JobNotificationController {

	@Autowired
	private JobNotificationService jobNotiService;

	@GetMapping("/job/{jobid}")
	public JobInfo getJobNotification(@PathVariable String jobid) {
		Optional<JobInfo> jobInfo = null;
		try {
			jobInfo = jobNotiService.getJobNotification(Long.valueOf(jobid));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("exception raised");
		}
		return jobInfo.get();
	}

	@PostMapping("/job/")
	public JobInfo saveJobNotification(@RequestBody JobInfo request) {
		return jobNotiService.saveJobNotification(request);
	}

	@PutMapping("/job")
	public JobInfo updateJobNotification(@RequestBody JobInfo request) {
		return jobNotiService.updateJobNotification(request);
	}

	@DeleteMapping("/job/{jobid}")
	public boolean deleteJobNotification(@PathVariable Long jobid) {
		boolean flag = false;
		;
		try {
			flag = jobNotiService.deleteJobNotification(Long.valueOf(jobid));
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("exception raised");
		}
		return flag;
	}
}
