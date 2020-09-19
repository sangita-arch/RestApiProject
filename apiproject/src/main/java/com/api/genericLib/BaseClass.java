package com.api.genericLib;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class BaseClass {
	
	public ApiConfig config =new ApiConfig();
	
	RestAssuredCommonUtils util = new RestAssuredCommonUtils();
	
	@BeforeSuite
	public void configBS() {
		RestAssured.baseURI = "https://restcountries.eu";
	     RestAssured.basePath = "/rest/v2";
	}
}
