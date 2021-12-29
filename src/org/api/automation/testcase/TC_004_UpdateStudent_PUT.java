package org.api.automation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_004_UpdateStudent_PUT {
	
	String putEndpoint = "http://thetestingworldapi.com/api/studentsDetails/445882";
	
	@Test
	public void addNewStudent() {
		
		//Configuration - Setting body and header
		RequestSpecification putRequestSpec = RestAssured.given();
		putRequestSpec.body("");
		putRequestSpec.header("content-type","appliacation/json");
		
		//Send PUT request
		Response putResponse = putRequestSpec.put(putEndpoint);
		System.out.println(putResponse.getStatusCode());
		System.out.println(putResponse.asPrettyString());
		
		//Adding validations -- Asserting status code
		
		Assert.assertEquals(putResponse.getStatusCode(), 200);
		
		
		
		
	}
}

	