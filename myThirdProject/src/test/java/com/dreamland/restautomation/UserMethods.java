package com.dreamland.restautomation;

import org.testng.annotations.Test;

import com.dreamland.restautomation.common.PayloadGenerator;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class UserMethods {
	
	@Test
	public void createUser() throws IOException
	{
		given()
		.header("Content-type", "application/json")
		.body(PayloadGenerator.generatePayload("createUser.json"))
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
		
	}
	@Test
	public void createUser2() throws IOException
	{
		given()
		.header("Content-type", "application/json")
		.body(PayloadGenerator.generatePayload("createUser2.json"))
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
		
	}

}
