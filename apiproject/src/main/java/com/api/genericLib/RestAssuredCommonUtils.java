package com.api.genericLib;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestAssuredCommonUtils {

	
	public void ValidateStatusCode(Response resp,int expectedStatusCode) {
		
		resp.then().assertThat().statusCode(expectedStatusCode);
		System.out.println(" Status Code Validation is Successful");
		
	}
	
     public void ValidateContentType(Response resp) {
		
		resp.then().assertThat().contentType(ContentType.JSON);
		System.out.println(" Content Type Validation is Successful");
		
	}
     
     public void ValidateResponseTime(Response resp,long withinRange) {
 		
 		resp.then().assertThat().time(Matchers.lessThan(withinRange));
 		System.out.println(" Response Time Validation is Successful");
 		
 	}
     
     public void ValidateKeyValuePair(Response resp,String jsonPath,String expectedValue) {
 		
 		Object obj = resp.jsonPath().get(jsonPath);
 		String actualValue = obj.toString();
 		Assert.assertEquals(actualValue, expectedValue);
 
 	}
 	
 	
	
}
