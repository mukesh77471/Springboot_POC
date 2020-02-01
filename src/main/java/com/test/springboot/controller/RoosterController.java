package com.test.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.language.RoosterLanguage;
import com.test.springboot.service.RoosterService;

@RestController
public class RoosterController {
	
	@Autowired
	private RoosterService roosterService;    
    
	@RequestMapping("/languages")
	public List<RoosterLanguage> roosterVoice() {
		return roosterService.getAllLanguage();
	}
	
	@RequestMapping("/languages/{country}")
	public RoosterLanguage getLanguage(@PathVariable String country) {
		return roosterService.getLanguage(country);
	}

}
