package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class CheckParametarisation {
	
	@Test(priority=1)
	public void getDatabyQS() {
		
		RequestSpecification reqsp = RestAssured.given();
		reqsp.queryParam("userId", "4");
		 RequestSender sender = reqsp.when();
		Response resp = sender.get("https://jsonplaceholder.typicode.com/posts");
		resp.then().log().all();
	}
	
	//Code Optimisation1................................
	
	@Test(priority=2)
	public void getDatabyQS1() {
		
		RestAssured.given().queryParam("userId", "4")
		.when().get("https://jsonplaceholder.typicode.com/posts")
		.then().log().all();
	}
	
	//Code Optimisation2(Static RestAssured)..................import static io.rest
	
		@Test(priority=3)
		public void getDatabyQS2() {
			
	         given().queryParam("userId", "4")
			.when().get("https://jsonplaceholder.typicode.com/posts")
			.then().log().all();
		}

}
