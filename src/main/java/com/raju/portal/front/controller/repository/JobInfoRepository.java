package com.raju.portal.front.controller.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.raju.portal.front.entity.JobInfo;

@Repository
public interface JobInfoRepository extends JpaRepository<JobInfo, Long> {

	List<JobInfo> findByJobName(String searchword, Pageable pegeable);

}
