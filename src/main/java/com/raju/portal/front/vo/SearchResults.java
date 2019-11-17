package com.raju.portal.front.vo;

import org.springframework.stereotype.Component;

import com.raju.portal.front.pojo.Company;
import com.raju.portal.front.pojo.Job;
import com.raju.portal.front.pojo.JobSeeker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SearchResults {
	private Company company;
	private Job job;
	private JobSeeker jobSeeker;

}
