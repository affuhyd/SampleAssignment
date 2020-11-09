package TestCases;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

import org.apache.http.entity.ContentType;

//5a8cffe36f1d846e14b1c3fddc07ba54
//6ea5a333d418a54d075223e1f3ab59bb

public class InsertRecordTC {

	public static void main(String[] args) {
		//Validate wheteher ADD API is working as expected.
		RestAssured.baseURI ="http://localhost:8080";
		InsertRecordPOJO record = new InsertRecordPOJO();
		record.setBirthday("12122011");
		record.setGender("Female");
		record.setName("Johan");
		record.setNatID("H0400402K");
		record.setSalary("100100");
		record.setTax("2.32");
		
		
		/*RequestSpecification requestSpecification = given()
				.header("Content-Type", "application/json")
				.body(record);

		Response response = requestSpecification.log().all().when().post("/calculator/insert");*/
		
		Response response = given().headers("Content-Type","application/json")
				.body(record).log().all().when().post("/calculator/insert");
		
		System.out.println("****************");
		System.out.println(response.asString());
		
		System.out.println(response.getStatusCode());
		
		ValidatableResponse val_Response = response.then();
		
		//val_Response.log().all().assertThat().statusCode(202);
		
		//System.out.println(val_Response.assertThat().body("status", equalTo("OK")));
		
		/*
		JsonPath js = new JsonPath(response.then().extract().asString());
		String scope = js.getString("scope");
		
		System.out.println(scope);
		System.out.println(js.getString("place_id"));
		System.out.println(js.getString("reference"));
		*/
		
		
		
		//.then().log().all().extract().response();
	}

}
