package TestCases;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class InsertMultipleRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://localhost:8080";

		RequestSpecification requestSpecification = given().header("Content-Type", "application/json")
				.body(RequestJson.getMultiple());

		Response response = requestSpecification.log().all().when().post("/calculator/insertMultiple");
		System.out.println("****************");
		System.out.println(response.asString());

		System.out.println(response.getStatusCode());

	}

}
