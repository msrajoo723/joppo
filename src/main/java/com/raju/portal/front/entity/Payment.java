package com.raju.portal.front.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paymentId")
	private Long paymentId;
	private String status;
	private String method;
	private Date paymentDate;
	private String paymentType;
	private String paymentGateway;
	private String transationId;
	private Double amount;
	private String tax;
	private String card_id;
	private String cardType;

	private String currency;
	private String order_id;
	private String invoice_id;
	
	private String amount_refunded;
	private String refund_status;

	private String description;
	private String bank;
	private String wallet;
	private String contact;
	private String emailId;
	
	@ManyToOne
	@JoinColumn(name = "companyid")
	@JsonIgnore
    private Company company;
}
