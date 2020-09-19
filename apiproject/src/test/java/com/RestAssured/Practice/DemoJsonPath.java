package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath {
	
	@Test
	public void checkJsonPath() {
		
		Response resp= RestAssured.get("http://localhost:3000/posts");
		resp.prettyPrint();
		
		//JSON path to Capture the Selenium Rating
		 Object seleniumRating =resp.jsonPath().get("Employee.skills.selenium");
		 System.out.println("Selenium Rating is : " + seleniumRating);
		 
		 
		//JSON path to Capture the Java Rating
		 Object javaRating =resp.jsonPath().get("Employee.skills.java");
		 System.out.println("Java Rating is : " + javaRating);
		 
		//JSON path to Capture the Manual Rating
		 Object manualRating =resp.jsonPath().get("Employee.skills.manual");
		 System.out.println("Manual Rating is : " + manualRating);
		 
		 
		//JSON path to Capture the Name of the Employee
		 Object name =resp.jsonPath().get("Employee.name");
		 System.out.println("Name of the employee is : " + name);
		 
		//JSON path to Capture All Skills
		 Object skills =resp.jsonPath().get("Employee.skills");
		 System.out.println("Skills and Rating is : " + skills);
		 
		 
		
	}

}
