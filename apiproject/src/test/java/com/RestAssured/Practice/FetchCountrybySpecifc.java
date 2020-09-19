package com.RestAssured.Practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchCountrybySpecifc {

	@Test(priority=1)
	public void fetchCodeforSpecificCountries() {
		
		String reqCountry ="French Polynesia";
		
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
			ArrayList<Object> allCountryName= resp.jsonPath().get("name");
			
			 Iterator<Object>itr =allCountryName.iterator();
			 
			 int count=0;
			 boolean flag=false;
			 
			 while(itr.hasNext()) {
				
				 Object obj =itr.next();
				 if(obj.equals(reqCountry)) {
					 System.out.println(reqCountry + "is present in list");
					 Object obj1 = resp.jsonPath().get("currencies.code["+count+"]");
					 System.out.println(reqCountry + " is having currency code " + obj1);
					 flag =true;
					 break;
					 
					 
				 }
				 count++;
				 
			 }
		if(!flag) {
			throw new IllegalArgumentException("country name is Invalid");
		}
			 
   }
	
	//ToCheck for Invalid Countryname and handled by Exception
	@Test(priority=2)
	public void fetchCodeforSpecificCountry() {
		
		String reqCountry ="Indiaa";
		
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
			ArrayList<Object> allCountryName= resp.jsonPath().get("name");
			
			 Iterator<Object>itr =allCountryName.iterator();
			 
			 int count=0;
			 boolean flag=false;
			 
			 while(itr.hasNext()) {
				
				 Object obj =itr.next();
				 if(obj.equals(reqCountry)) {
					 System.out.println(reqCountry + "is present in list");
					 Object obj1 = resp.jsonPath().get("currencies.code["+count+"]");
					 System.out.println(reqCountry + " is having currency code " + obj1);
					 flag =true;
					 break;
					 
					 
				 }
				 count++;
				 
			 }
		if(!flag) {
			throw new IllegalArgumentException("country name is Invalid");
		}
		
	}	
	
	//Using Collection Method
	
	@Test(priority=3)
	public void fetchCodeforSpecificCountry1() {
		
		String reqCountry ="India";
		
		 Response resp = RestAssured.get("https://restcountries.eu/rest/v2/all");
			ArrayList<Object> allCountryName= resp.jsonPath().get("name");
			
			if(allCountryName.contains(reqCountry)) {
				int index = allCountryName.indexOf(reqCountry);
				Object obj1 = resp.jsonPath().get("currencies.code["+index+"]");
				 System.out.println(reqCountry + " is having currency code " + obj1);
				
			}
			else {
				throw new IllegalArgumentException("country name is Invalid");
			}
	
	  }
			
 }
