package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class AddBulkDataTest extends BaseClass {
	
	@Test
	public void checkNewData() throws Exception  {
		
		
		String apiTestData =config.getApiTestData("addBulkData");
		Response resp =config.executeBulkPostRequest(apiTestData);
		
		resp.then().log().all();
		
			
	}

}
