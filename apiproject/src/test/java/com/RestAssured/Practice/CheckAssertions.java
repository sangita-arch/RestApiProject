package com.RestAssured.Practice;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;




public class CheckAssertions {
	
	//Using TestNG Assertions
	
	@Test
	public void getAssertion() {
		Response resp = given(). param("userId","4").pathParam("x", "posts")
		.when().get("https://jsonplaceholder.typicode.com/{x}");
		
		 int statusCode =resp.getStatusCode();
		 System.out.println("Status Code is  : " + statusCode );
		 Assert.assertEquals(statusCode, 200);
		 
		 String contentType = resp.getContentType();
		 System.out.println(" Content type is : "+ contentType);
		 Assert.assertEquals(contentType, "application/json; charset=utf-8");
		 
		  Long TimeInMs = resp.getTime();
		  System.out.println(" Response time is : "+ TimeInMs);
		  Assert.assertTrue(TimeInMs<15000);
		  
		   Object title = resp.jsonPath().get("title[1]");
		   System.out.println(" 2nd Object title is : " + title);
		   Assert.assertEquals(title, "doloremque illum aliquid sunt");
		   
		   
		   resp.then().log().all();
		   
		 
	}
	
	//Using RestAssured Assertions
	@Test(priority=2)
	public void getAssertionbyRA() {
		Response resp = given(). param("userId","4").pathParam("x", "posts")
		.when().get("https://jsonplaceholder.typicode.com/{x}");
		
		resp.then().assertThat().statusCode(200);
		resp.then().assertThat().contentType("application/json; charset=utf-8");
		resp.then().assertThat().time(Matchers.lessThan(10000L));
		
		resp.then().log().all();
		
		

}
	
	
}	
