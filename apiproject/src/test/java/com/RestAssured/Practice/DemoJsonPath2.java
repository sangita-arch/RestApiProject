package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath2 {
	
	@Test
	public void checkJsonPath() {
		
		Response resp= RestAssured.get("http://localhost:3000/posts");
		resp.prettyPrint();
		
		//JSON path to Capture the Selenium Rating
		 Object seleniumRating =resp.jsonPath().get("Employee.skills.selenium[0]");
		 System.out.println("Selenium Rating is : " + seleniumRating);
		 
		 
		//JSON path to Capture the Java Rating
		 Object javaRating =resp.jsonPath().get("Employee.skills.java[0]");
		 System.out.println("Java  Rating is : " + javaRating);
		 
		//JSON path to Capture the Manual Rating
		 Object manualRating =resp.jsonPath().get("Employee.skills.manual[0]");
		 System.out.println("Manual Rating is : " + manualRating);
		 
		 
		//JSON path to Capture the Name of the Employee
		 Object name =resp.jsonPath().get("Employee.name[0]");
		 System.out.println("Name of the employee is : " + name);
		 
		//JSON path to Capture All Skills
		 Object skills =resp.jsonPath().get("Employee.skills[0]");
		 System.out.println("All skills and  Rating is : " + skills);
		 
		 
		//JSON path to Capture the Selenium Rating
		 Object seleniumRating1 =resp.jsonPath().get("Employee.skills.selenium[1]");
		 System.out.println("Selenium Rating is : " + seleniumRating1);
		 
		 
		//JSON path to Capture the Java Rating
		 Object javaRating1 =resp.jsonPath().get("Employee.skills.java[1]");
		 System.out.println("Java  Rating is : " + javaRating1);
		 
		//JSON path to Capture the Manual Rating
		 Object manualRating1 =resp.jsonPath().get("Employee.skills.manual[1]");
		 System.out.println("Manual Rating is : " + manualRating1);
		 
		 
		//JSON path to Capture the Name of the Employee
		 Object name1 =resp.jsonPath().get("Employee.name[1]");
		 System.out.println("Name of the employee is : " + name1);
		 
		//JSON path to Capture All Skills
		 Object skills1 =resp.jsonPath().get("Employee.skills[1]");
		 System.out.println("All skills and  Rating is : " + skills1);
		 
		
	}

}
