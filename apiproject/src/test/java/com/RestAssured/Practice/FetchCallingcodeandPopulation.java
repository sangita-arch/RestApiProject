package com.RestAssured.Practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCallingcodeandPopulation {
	 
	@Test
	public void fetchCallingcodeandPopulation() {
		
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
		 ArrayList<Object> allCurrencycode = resp.jsonPath().get("currencies.code");
		 
						 int count=0;
			for(Object currencycode :allCurrencycode) {
				
				System.out.println(currencycode);
				Object obj1 = resp.jsonPath().get("callingCodes["+count+"]");
				System.out.println(obj1);
				Object obj2 = resp.jsonPath().get("population["+count+"]");
				System.out.println(obj2);
				count++;
			}
				
			
					 
		   }

}
