package com.test.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.springboot.error.CountryNotFoundException;
import com.test.springboot.language.RoosterLanguage;

@Service
public class RoosterService {

	private List<RoosterLanguage> roosterLanguage = Arrays.asList(new RoosterLanguage("Danish", "kykyliky"),
			new RoosterLanguage("Dutch", "kukeleku"), new RoosterLanguage("Finnish", "kukko kiekuu"),
			new RoosterLanguage("French", "cocorico"), new RoosterLanguage("German", "kikeriki"),
			new RoosterLanguage("Greek", "kikiriki"), new RoosterLanguage("Hebrew", "coo-koo-ri-koo"),
			new RoosterLanguage("Hungarian", "kukuriku"), new RoosterLanguage("Italian", "chicchirichi"),
			new RoosterLanguage("Japanese", "ko-ke-kok-ko-o"), new RoosterLanguage("Portugese", "cucurucu"),
			new RoosterLanguage("Russian", "Kukareku"), new RoosterLanguage("Swedish", "kuckeliku"),
			new RoosterLanguage("Turkish", "kuk-kurri-kuu"), new RoosterLanguage("Urdu", "kuklooku")

	);

	public List<RoosterLanguage> getAllLanguage() {
		return roosterLanguage;
	}

	public RoosterLanguage getLanguage(String lang) {
		try {
			return roosterLanguage.stream().filter(t ->t != null  && t.getCountry().equals(lang)).findAny().get();
		} catch (CountryNotFoundException e) {
			throw new CountryNotFoundException(lang);
		}
	}
}
