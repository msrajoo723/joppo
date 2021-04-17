package com.raju.portal.front.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raju.portal.front.entity.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Long>{

}
