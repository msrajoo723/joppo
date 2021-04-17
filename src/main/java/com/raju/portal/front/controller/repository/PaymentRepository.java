package com.raju.portal.front.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raju.portal.front.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>  {

}
