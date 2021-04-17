package com.raju.portal.front.vo;

import org.springframework.stereotype.Component;

import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;
import com.raju.portal.front.entity.JobSeeker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This is pojo class of SearchResults.
 * 
 * @author raju
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class SearchResults {
	private Company company;
	private JobInfo job;
	private JobSeeker jobSeeker;

}
