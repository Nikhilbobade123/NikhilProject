package com.a;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class CarEngin {
	public static void main(String[] args) {
		Engine en= new Engine();
		en.setPower("155 BHC");
		en.setCc(3243);
		Car cr = new Car();
		cr.setModel("Mahindra");
		cr.setMake("XUV500");
		cr.getEngine();
		cr.setEngine(en);
		given()
		.log()
		.all()
		.contentType(ContentType.JSON)
		.body(cr)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
	}
}
