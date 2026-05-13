package com.searchengine.ssearchapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.searchengine.ssearchapp.model.SearchEngineData;

public interface SearchEngineRepository extends JpaRepository<SearchEngineData, Integer> {

	List<SearchEngineData> findAllByTitle(String title);
	
	List<SearchEngineData> findAllByDescription(String description);
	
	List<SearchEngineData> findAllByUrl(String url);
	
	List<SearchEngineData> findAllByKeywords(String keywords);
}
