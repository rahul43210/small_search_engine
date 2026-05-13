package com.searchengine.ssearchapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.searchengine.ssearchapp.dto.SearchEngineResponseDto;
import com.searchengine.ssearchapp.service.SearchEngineService;

@RestController
@RequestMapping("/v1/api")
public class SearchEngineController {

	private SearchEngineService searchEngineService;
	
	public SearchEngineController(SearchEngineService searchEngineService) {
		this.searchEngineService = searchEngineService;
	}
	
	@GetMapping("/search/{query}")
	public SearchEngineResponseDto search(@PathVariable String query) {
		return searchEngineService.search(query);
	}
}
