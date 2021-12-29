package org.api.automation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_006_RequestChaining_POST_GET {
	
	String appbaseURL = "http://thetestingworldapi.com/";
	String firstName = "Testing";
	String middleName = "W";
	String lastName = "World";
	String dob = "12/12/1990";
	
	@Test
	public void addAndValidateStudent() {
		
		RequestSpecification postRequestSpec = RestAssured.given();
		postRequestSpec.body("");
		postRequestSpec.header("content-type","application/json");
	
		Response postResponse = postRequestSpec.post(appbaseURL + "api/studentDetails");
		System.out.println("PostRequest Response: ");
		System.out.println("**********************************");
		System.out.println(postResponse.asPrettyString());
		
		String studentID = postResponse.jsonPath().getString("id");
		
		
		Response getResponse = RestAssured.get(appbaseURL + "api/studentDetails/" + studentID);
		System.out.println(getResponse.getStatusCode());
		System.out.println(getResponse.asPrettyString());
	}
}

	