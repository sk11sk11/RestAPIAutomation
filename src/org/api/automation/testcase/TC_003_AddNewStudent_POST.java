package org.api.automation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_003_AddNewStudent_POST {
	
	String postEndpoint = "http://localhost:3000/posts";
	
	@Test
	public void addNewStudent() {
		
		RequestSpecification postRequest = RestAssured.given();
		postRequest.body("{\"id\": 2,\"title\":\"Art of War\",\"author\":\"SunTzu\"}");
		postRequest.header("content-type","application/json");
		
		Response postresponse = postRequest.post(postEndpoint);
		System.out.println(postresponse.statusCode());
		Assert.assertEquals(postresponse.statusCode(), 201);
		System.out.println(postresponse.asPrettyString());
		
	}
}

	