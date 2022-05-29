package com.a;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class C21 {
public static void main(String[] args) {
	C4 Object=new C4();
	Object.setName("The Great Gatsby");
	Object.setIsbn("nikh124");
	Object.setAisle("23222");
	Object.setAuthor(" F. Scott Fitzgerald");
	
	given()
	//.contentType(ContentType.JSON)
	.log()
	.all()
	.body(Object)
	.when()
	.post("http://216.10.245.166/Library/Addbook.php")
	.then()
    .log()
    .all();
}
}

