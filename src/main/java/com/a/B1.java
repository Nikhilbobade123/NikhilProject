package com.a;

import static io.restassured.RestAssured.given;

public class B1 {
	public static void main(String[] args) {
		given().log().all().when().get("https://gorest.co.in/public/v2/users/2624").then().assertThat().statusCode(200)
		.log().all();
	}

}
