package com.test.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.language.RoosterLanguage;

@RestController
public class RoosterController {
	
	
	@RequestMapping("/languages")
	public List<RoosterLanguage> roosterVoice() {
		return Arrays.asList(
				new RoosterLanguage("Danish","kykyliky"),
				new RoosterLanguage("Dutch","kukeleku"),
				new RoosterLanguage("Finnish","kukko kiekuu"),
				new RoosterLanguage("French","cocorico"),
				new RoosterLanguage("German","kikeriki"),
				new RoosterLanguage("Greek","kikiriki"),
				new RoosterLanguage("Hebrew","coo-koo-ri-koo"),
				new RoosterLanguage("Hungarian","kukuriku"),
				new RoosterLanguage("Italian","chicchirichi"),
				new RoosterLanguage("Japanese","ko-ke-kok-ko-o"),
				new RoosterLanguage("Portugese","cucurucu"),
				new RoosterLanguage("Russian","Kukareku"),
				new RoosterLanguage("Swedish","kuckeliku"),
				new RoosterLanguage("Turkish","kuk-kurri-kuu"),
				new RoosterLanguage("Urdu","kuklooku")
			
				);
	}

}
