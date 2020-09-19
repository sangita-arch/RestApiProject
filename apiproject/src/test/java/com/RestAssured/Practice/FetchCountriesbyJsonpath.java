package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCountriesbyJsonpath {
	
	@Test(priority=1)
	public void fetchCurrencyCode() {
		
		//Capture ALL Currency Codes
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		Object obj = resp.jsonPath().get("currencies.code");
		System.out.println(obj);
		
		//Capture First Currency Code
		
		Object obj1 = resp.jsonPath().get("currencies.code[0]");
		System.out.println(obj1);
		
		
	}
	
	@Test(priority=2)
	public void fetchCountries() {
		
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
			Object allCountryname = resp.jsonPath().get("name");
			System.out.println(allCountryname);
		
	}
	
	
	
	
	
	

}
