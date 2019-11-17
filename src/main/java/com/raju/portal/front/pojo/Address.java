package com.raju.portal.front.pojo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {
	private String address1;
	private String address2;
	private String city;
	private String country;
	private String pincode;
	private List<String> emails;
	private List<String> phones;

}
