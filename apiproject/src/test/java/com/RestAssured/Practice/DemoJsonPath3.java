package com.RestAssured.Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoJsonPath3 {
	
	@Test
	public void checkJsonPath() {
		
		Response resp= RestAssured.get("http://localhost:3000/posts");
		resp.prettyPrint();
		
		//JSON path to Capture the Highspeed
		 Object highspeedvel =resp.jsonPath().get("Vehicle.Features.highspeed[0]");
		 System.out.println("High Speed Velocity of car  is : " + highspeedvel);
		 
		 
		//JSON path to Capture the Meadium Speed
		 Object meadiumspeedvel =resp.jsonPath().get("Vehicle.Features.meadiumspeed[0]");
		 System.out.println("Meadium Speed of car is : " + meadiumspeedvel);
		 
		//JSON path to Capture the SlowSpeed
		 Object slowspeedvel =resp.jsonPath().get("Vehicle.Features.slowspeed[0]");
		 System.out.println("Slow speed of car is : " + slowspeedvel);
		 
		 
		//JSON path to Capture the Type of the Car
		 Object type =resp.jsonPath().get("Vehicle.Type[0]");
		 System.out.println("Type of the Vehicle is : " + type);
		 
		//JSON path to Capture All Features of Car
		 Object features =resp.jsonPath().get("Vehicle.Features[0]");
		 System.out.println("All features and speed is : " + features);
		 
		 
		//JSON path to Capture the Highspeed
		 Object highspeedvel1 =resp.jsonPath().get("Vehicle.Features.highspeed[1]");
		 System.out.println("High Speed Velocity of car  is : " + highspeedvel1);
		 
		 
		//JSON path to Capture the Meadium Speed
		 Object meadiumspeedvel1 =resp.jsonPath().get("Vehicle.Features.meadiumspeed[1]");
		 System.out.println("Meadium Speed of car is : " + meadiumspeedvel1);
		 
		//JSON path to Capture the SlowSpeed
		 Object slowspeedvel1 =resp.jsonPath().get("Vehicle.Features.slowspeed[1]");
		 System.out.println("Slow speed of car is : " + slowspeedvel1);
		 
		 
		//JSON path to Capture the Type of the Car
		 Object type1 =resp.jsonPath().get("Vehicle.Type[1]");
		 System.out.println("Type of the Vehicle is : " + type1);
		 
		//JSON path to Capture All Features of Car
		 Object features1 =resp.jsonPath().get("Vehicle.Features[1]");
		 System.out.println("All features and speed is : " + features1);
		 
		 
		
	}

}
