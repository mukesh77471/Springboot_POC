package com.test.springboot.language;

public class RoosterLanguage {

	private String country;
	private String says;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSays() {
		return says;
	}

	public void setSays(String says) {
		this.says = says;
	}

	public RoosterLanguage(String country, String says) {
		super();
		this.country = country;
		this.says = says;
	}

	public RoosterLanguage() {

	}

}
