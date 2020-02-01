package com.test.springboot.error;

public class CountryNotFoundException extends RuntimeException {
	
	public CountryNotFoundException(String country) {
		super("Country Not available"+country);
	}

}
