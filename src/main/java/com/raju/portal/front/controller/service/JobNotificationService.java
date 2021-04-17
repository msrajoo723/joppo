package com.raju.portal.front.controller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.raju.portal.front.controller.repository.JobInfoRepository;
import com.raju.portal.front.entity.JobInfo;

@Service
public class JobNotificationService {

	@Autowired
	private JobInfoRepository jobNotificationRepo;
	
	public Optional<JobInfo> getJobNotification(Long jobid) {
		return jobNotificationRepo.findById(jobid);
	}

	public JobInfo saveJobNotification(JobInfo jobNoti) {
		return jobNotificationRepo.save(jobNoti);
		
	}

	public JobInfo updateJobNotification(JobInfo jobNoti) {
		return jobNotificationRepo.save(jobNoti);
	}

	public boolean deleteJobNotification(Long jobid) throws IllegalArgumentException {
		jobNotificationRepo.deleteById(jobid);
		return true;
	}
	
	public Page<JobInfo> findByJobName(Pageable pageable) {

		// return jobRepo.findByJobName(searchword, PageRequest.of(0, 3, Direction.ASC,
		// "jobName"));
		Page<JobInfo> j1 = null;
		try {
			j1 = jobNotificationRepo.findAll(pageable);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return j1;
	}

}
