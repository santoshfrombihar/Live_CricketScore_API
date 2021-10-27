package com.cricketscore.controller;

import com.cricketscore.service.CricketScoreService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketController {

	@Autowired
	private CricketScoreService cricketscoreService;
	
	@RequestMapping("/cricketscore")
	@GetMapping()
	public Map<String,Object> getLatestCricketScore()
	{
		  String JSON_SOURCE = this.cricketscoreService.getLatestScore();
		  String res = null;
		  
		  try {
				Map<String,Object> result = new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);
				         
				     
				
				return result;
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			return  null;
		  
	}
	
}
