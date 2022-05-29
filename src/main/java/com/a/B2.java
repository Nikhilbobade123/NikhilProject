package com.a;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

public class B2 {
public static void main(String[] args) {
		
		given()
		.log()
		.all()
		.when()
		.get("https://gorest.co.in/public/v2/users/2624")
		.then()
		.assertThat()//I have a doubt->without adding this method i am able to perform assertion on below 
		.statusCode(200)
		.body("id",Matchers.greaterThan(2000))
		.log()
		.all();
	}
}




