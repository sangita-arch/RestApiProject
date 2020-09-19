package com.RestAssured.Practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class CheckParametarisation1 {
	
	// Using formParam 
	@Test(priority=1)
	public void getDatabyQS() {
		
		given().formParam("userId", "4")
		 .when().get("https://jsonplaceholder.typicode.com/posts")
		.then().log().all();
	}
	
// Using Param
	
	@Test(priority=2)
	public void getDatabyQS1() {
		
		given().param("userId", "4")
		 .when().get("https://jsonplaceholder.typicode.com/posts")
		.then().log().all();
	}
	
	//Using Both Param  and PathParam 
	@Test(priority=3)
	public void getDatabyQS2() {
		
		given().param("userId", "4")
		.pathParam("x", "posts")
		 .when().get("https://jsonplaceholder.typicode.com/{x}")
		.then().log().all();
	}
	

	//Using  PathParam , 404 error as in place of x resource path will not work
	@Test(priority=4)
	public void getDatabyQS3() {
		
		given().pathParam("x", "rest/v2/all")
		 .when().get("https://restcountries.eu/{x}")
		.then().log().all();
	}
	
	//using multiple resource path as x, y , z
	@Test(priority=5)
	public void getDatabyQS4() {
		
		given().pathParam("x", "rest").pathParam("y", "v2").pathParam("z", "all")
		 .when().get("https://restcountries.eu/{x}/{y}/{z}")
		.then().log().all();
	}
}
