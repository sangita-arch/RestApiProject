package com.RestAssured.Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class AddnewDatainPosts {
	
	@Test
	public void createNewData() {
		
		//Step 1: Set precondition
		RequestSpecification reqpc =RestAssured.given();
		
		
		// Step 2 : Create JSON Object
		JSONObject jobj= new JSONObject();
		jobj.put("id", 6);
		jobj.put("name", "Savitha");
		jobj.put("Designation", " Sr Developer");
		
		//Step 3 : Convert into JSON object and provide body
		  String jsonData=jobj.toJSONString();
		  reqpc.body(jsonData);
		  
	   //Step 4 : Set Content Type for Request
		reqpc.contentType(ContentType.JSON);
		
		//Step 5 : Apply precondition on Request
		 RequestSender sender=reqpc.when();
		 
		 //Step 6: Send the Request
		 Response resp= sender.post("http://localhost:3000/posts");
		 
		 //Step 7: Fetch the data 
		 
		 /* System.out.println("status code is : " + resp.getStatusCode());
		  System.out.println(".....................................................");
		  
		 System.out.println("contentType is : "+ resp.getContentType());
		 System.out.println(".....................................................");
		 
		 System.out.println("actualData is : " + "\n"+ resp.asString());
		 System.out.println(".....................................................");
		 
  		 System.out.println("response time is : " + resp.getTime()+  " ms "  );*/
		 
		 
		 //OR
		 
		 	//Using Post Condition Then()
		  //  resp.then().log().all();
		 
		 //OR
		 ValidatableResponse then = resp.then();
		 then.log().all();
		
	}

}
