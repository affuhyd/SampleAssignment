package TestCases;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UploadCSV {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:8080";

		RequestSpecification requestSpecification = given()
				.multiPart("file", new File("src/test/resources/Sample_CitizensData2.csv"));
		
		Response response = requestSpecification.log().all()
				.expect().statusCode(200)
				.when().post("/calculator/uploadLargeFileForInsertionToDatabase");
		System.out.println("****************");
		System.out.println(response.asString());

		System.out.println(response.getStatusCode());

	}

}
