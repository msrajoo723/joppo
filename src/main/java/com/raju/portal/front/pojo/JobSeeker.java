package com.raju.portal.front.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	private String userName;
	// private Profile profile;
	private String bookmark;
	private String whishlist;
	private String userType;
}
