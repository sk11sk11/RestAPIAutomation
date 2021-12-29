package org.api.automation.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_005_DeleteStudent_DELETE {
	
	String deleteURL = "http://thetestingworldapi.com/api/studentsDetails/445882";
	
	@Test
	public void deleteStudent() {
		
		Response deleteResponse = RestAssured.delete(deleteURL);
		System.out.println(deleteResponse.statusCode());
		System.out.println(deleteResponse.asPrettyString());
		
		Assert.assertEquals(deleteResponse.statusCode(), 200);
		
		
		
	}
}

	