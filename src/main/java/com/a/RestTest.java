package com.a;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;


import io.restassured.http.ContentType;

public class RestTest {
public static void main(String[] args) {
		
		Engine engine = new Engine();
		engine.setPower("HP");
		engine.setCc(2499);
		
		
		Electronicitems el = new Electronicitems();
		el.setPrice(5000);
		el.setType("musicPlayers");
		
		
		Electronicitems el2 = new Electronicitems();
		el2.setPrice(6000);
		el2.setType("mirrors");
		
		
		ArrayList<Electronicitems> al = new ArrayList<Electronicitems>();
		al.add(el);
		al.add(el2);
		
		
		
		
		Car car = new Car();
		
		car.setMake("Mahindra");
		car.setModel("XUV500");
		car.setEngine(engine);
		car.Electronicitems(al);
		
		
		given()
		.log()
		.all()
		.contentType(ContentType.JSON)
		.body(car)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log()
		.all();
	}
	

}



