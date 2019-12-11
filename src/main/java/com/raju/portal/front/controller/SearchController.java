package com.raju.portal.front.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raju.portal.front.controller.service.ApplicationService;
import com.raju.portal.front.vo.SearchRequest;
import com.raju.portal.front.vo.SearchResults;

@RestController
@RequestMapping("/v1")
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private ApplicationService applicationService;

	@GetMapping("/")
	public ResponseEntity<List<SearchResults>> getResults() {
		logger.debug("Enter into SearchController.getResult() /search");

		logger.debug("Exit from SearchController.getResult()");
		return new ResponseEntity<>(applicationService.getResults(), HttpStatus.OK);
	}

	@GetMapping("/search")
	public ResponseEntity<List<SearchResults>> getSearchResultsWithFour(@RequestBody SearchRequest searchRequest) {
		logger.debug("Enter into SearchController.getResult() /search");
		logger.debug("Exit from SearchController.getResult()");
		return new ResponseEntity<>(applicationService.getResults(), HttpStatus.OK);
	}
}
