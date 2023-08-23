package in.amazon.restAssuredDemo;

import java.util.HashMap;
import java.util.UUID;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class LoggerDemo extends TestBase {

	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "batman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload Created");
	}
	
	@Test
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer a87a3c1427621f5ecc22b2d7fee8b36b5f5419dfe584dde09c73451c5ab76790")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
		logger.info("Resource Created Successfully");
	}
}
