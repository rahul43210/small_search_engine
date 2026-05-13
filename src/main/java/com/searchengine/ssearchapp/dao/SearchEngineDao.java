package com.searchengine.ssearchapp.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.searchengine.ssearchapp.model.SearchEngineData;
import com.searchengine.ssearchapp.repository.SearchEngineRepository;

@Repository
public class SearchEngineDao {

	@Autowired
	private SearchEngineRepository searchEngineRepository;
	
	public Set<SearchEngineData> searchEngineResult(String query) {
		final Set<SearchEngineData> searchEngineData = new HashSet<>(); 
		searchEngineData.addAll(searchEngineRepository.findAllByTitle(query));
		searchEngineData.addAll(searchEngineRepository.findAllByDescription(query));
		searchEngineData.addAll(searchEngineRepository.findAllByUrl(query));
		searchEngineData.addAll(searchEngineRepository.findAllByKeywords(query));
		
		return searchEngineData;
	}
}
