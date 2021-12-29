package org.api.automation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_001_ValidateStudentFetchData {

	//String getStudentEndpoint = "http://thetestingworldapi.com/api/studentsDetails/300000";
	String homeURL = "http://localhost:3000/posts";
	//String google = "https://www.google.com";
	
	@Test
	public void validateStudentData() {
		Response response = RestAssured.get(homeURL);
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println(response.getHeaders());
				
		//System.out.println(response.getHeader("Content-Length"));
		//Assert.assertEquals(response.getHeader("Server"), "Microsoft-HTTPAPI/2.0");
		
		//Assert.assertEquals(response.jsonPath().getString("data.first_name"), "shuvi");
		
		System.out.println(response.asPrettyString());
		
	}
	
}
