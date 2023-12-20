package PhaseEndProject;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class Assignment005Demo {
	@Test(priority='1')
	public void assignment005FindByStatus()
	{
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet/findByStatus")
		//.queryParam("status", "available")
		//.queryParam("status", "pending")
		.queryParam("status", "sold")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all();
	
	}
}
