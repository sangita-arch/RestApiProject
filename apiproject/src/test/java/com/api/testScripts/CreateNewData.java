package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.genericLib.ApiConfig;
import com.api.genericLib.BaseClass;

import io.restassured.response.Response;

public class CreateNewData extends BaseClass {
	
	@Test
	public void checkNewData() throws Exception  {
		
		
		String apiTestData =config.getApiTestData("createNewData");
		Response resp =config.executeRequest(apiTestData);
		resp.then().log().all();
		
			
	}

}
