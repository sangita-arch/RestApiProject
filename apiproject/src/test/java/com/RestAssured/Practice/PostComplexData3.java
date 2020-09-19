package com.RestAssured.Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class PostComplexData3 {
	
	
	@Test
	public void addComplexData() {
		
		// Step 1 :-Set Precondition 
		RequestSpecification req = RestAssured.given();
		
		// Step 2: Build JSON Objects
		JSONObject jobj1= new JSONObject();
		jobj1.put("slowspeed" , " 1-10");
		jobj1.put("meadiumspeed" , "20-40");
		jobj1.put("highspeed" , "60-100");
		
		JSONObject jobj2= new JSONObject();
		jobj2.put("Type", "Nexa");
		jobj2.put("number", 2001);
		jobj2.put("Features", jobj1);
		
		JSONObject jobj3= new JSONObject();
		jobj3.put("Vehicle", jobj2);
		
				
		//Step 3:- Convert a Proper JSON Object
		String jsonData= jobj3.toJSONString();
		req.body(jsonData);
		req.contentType(ContentType.JSON);
		
		//Step 4:- Apply Precondition
		RequestSender sender=req.when();
		
		
		//Step 5:- Send the Request with precondition
		Response resp= sender.post("http://localhost:3000/posts");
		
		//Step 6:- Fetch from Response
		resp.then().log().all();
		
	}

}
