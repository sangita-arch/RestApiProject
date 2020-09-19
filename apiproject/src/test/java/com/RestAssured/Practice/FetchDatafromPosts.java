package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchDatafromPosts {

	@Test
	public void getData() {
		Response resp= RestAssured.get("http://localhost:3000/posts");
		  int statuscode=resp.getStatusCode();
		  System.out.println("status code is : " + statuscode);
		  System.out.println(".....................................................");
		  
		 String contentType= resp.getContentType();
		 System.out.println("contentType is : "+ contentType);
		 System.out.println(".....................................................");
		 
		 String actualData=resp.asString();
		 System.out.println("actualData is : " + "\n"+ actualData );
		 System.out.println(".....................................................");
		 
		long timeinMS= resp.getTime();
		System.out.println("response time is : " + timeinMS +  " ms "  );
		
	}
}
