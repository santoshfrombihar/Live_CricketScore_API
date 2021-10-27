package com.cricketscore.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CricketScoreServiceImpl implements CricketScoreService {

	
	public String getLatestScore() {
		
		String url = "https://api.api-cricket.com/?method=get_livescore&APIkey=355c717f3652228ccfaec7705165715981abb92f8d726fddf6bc0e0993c50ca7";
		RestTemplate resttemp = new RestTemplate();
		String result = resttemp.getForObject(url, String.class);
		
		return result;
	}

}
