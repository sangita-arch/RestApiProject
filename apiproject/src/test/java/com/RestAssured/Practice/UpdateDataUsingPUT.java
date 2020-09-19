package com.RestAssured.Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class UpdateDataUsingPUT {
	
	@Test
	public void updateWithPUT() {
		
		//Step 1: Set precondition
				RequestSpecification reqpc =RestAssured.given();
				
				
				// Step 2 : Create JSON Object
				JSONObject jobj= new JSONObject();
				
				jobj.put("name", "Ranjitha");
				jobj.put("Designation", "Sr Tester");
				
				
				
				//Step 3 : Convert into JSON object and provide body
				  String jsonData=jobj.toJSONString();
				  reqpc.body(jsonData);
				  
			   //Step 4 : Set Content Type for Request
				reqpc.contentType(ContentType.JSON);
				
				//Step 5 : Apply precondition on Request
				 RequestSender sender=reqpc.when();
				 
				 //Step 6: Send the Request
				 Response resp= sender.put("http://localhost:3000/posts/5");
				 
				//Step 7: Fetch Using Post Condition Then()
				    resp.then().log().all();
		
		
	}

}
