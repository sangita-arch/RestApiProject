package com.RestAssured.Practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FetchTitleandNo {
	
	@Test
	public void fetchTitleandPageCount() {
		
		
				
		 Response resp = RestAssured.get("https://www.googleapis.com/books/v1/volumes?q=turing");
			ArrayList<Object> alltitle= resp.jsonPath().get("items.volumeInfo.title");
			
			
			 int count=0;
			
			 
			for(Object title1 :alltitle) {		
				
					 System.out.println(title1 );
					 Object obj1 = resp.jsonPath().get("items.volumeInfo.pageCount["+count+"]");
					 System.out.println( obj1);
					
					 count++;
					 
				 }
				

              }
	}
	
	
