package TestCases;

import static io.restassured.RestAssured.given;

import java.util.List;

import Base.GettaxRelief_POJO;
import Base.getUser_POJO;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BookKeeper_taxRelief {

	public static void main(String[] args) {

		RestAssured.baseURI = "http://localhost:8080";
		GettaxRelief_POJO getTax ;
		//Response response = given().log().all().when().get("/calculator/taxRelief");
		
		getTax = given().expect().defaultParser(Parser.JSON).when().get("/calculator/taxRelief")
				.as(GettaxRelief_POJO.class);
		
		System.out.println(getTax.getUserList());
		
	/*	for (getUser_POJO user : getTax.getUserList()) {
			System.out.println(user.getName());
			System.out.println(user.getnatID());
			System.out.println(user.getrelief());
		}
*/		// System.out.println(ls);
		System.out.println("****************");
		//System.out.println(response.asString());

		/*System.out.println(response.getStatusCode());
		JsonPath js = new JsonPath(response.asString());
		int size = js.getInt("array.size()");
		System.out.println(js.getInt("array.size()"));
		
		
		//for(int i=0; i<size;i++) {
			
			System.out.println(js.get("array")) ;*/
		

	}

}
