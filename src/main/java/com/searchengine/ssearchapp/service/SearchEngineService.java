package com.searchengine.ssearchapp.service;

import com.searchengine.ssearchapp.dto.SearchEngineResponseDto;

public interface SearchEngineService {

	SearchEngineResponseDto search(String query);

}
