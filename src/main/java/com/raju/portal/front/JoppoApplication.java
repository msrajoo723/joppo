package com.raju.portal.front;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.raju.portal.front"})
//@ComponentScan(basePackages="com.raju.portal.front")
public class JoppoApplication {
	private static final Logger logger = LoggerFactory.getLogger(JoppoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JoppoApplication.class, args);
		logger.info("Application is running...");
	}
}