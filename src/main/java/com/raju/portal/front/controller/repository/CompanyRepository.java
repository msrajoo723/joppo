package com.raju.portal.front.controller.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.raju.portal.front.entity.Company;
import com.raju.portal.front.entity.JobInfo;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

}
