package in.amazon.restAssuredDemo;

import java.util.HashMap;
import java.util.UUID;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.is;

public class create_update_delete_Resource extends TestBase {

	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test(priority = 0)
	public void createPayLoad() {
		map.put("name", "ironman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload Created");
	}
	
	@Test(priority = 1)
	public void createResource() {
		response = RestAssured
								.given()
									.contentType("application/json")
									.body(map)
									.header("Authorization", "Bearer a87a3c1427621f5ecc22b2d7fee8b36b5f5419dfe584dde09c73451c5ab76790")
								.when()
									.post()
								.then()
									.log().all()
									.extract().response();
		logger.info("Resource Created Successfully");
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
	}
	
	@Test(priority = 2)
	public void verifyResource() {
		System.out.println("Id = " + id);
		RestAssured
		.given()
			.contentType("application/json")
			.header("Authorization", "Bearer a87a3c1427621f5ecc22b2d7fee8b36b5f5419dfe584dde09c73451c5ab76790")
		.when()
			.get("https://gorest.co.in/public/v2/users/" + id)
		.then()
			.statusCode(200)
			.log().all();
		logger.info("Resource Verified");
		Assert.assertTrue(jsonPath.get("name").equals("ironman"));
	}
	
	@Test(priority = 3)
	public void updateResource() {
		map.put("name", "ironmann");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer a87a3c1427621f5ecc22b2d7fee8b36b5f5419dfe584dde09c73451c5ab76790")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
				.log().all()
				.assertThat()
				.body("name", is("ironmann"));
		logger.info("Resource Updated");
	}
	
	@Test(priority = 4)
	public void deleteResource() {
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		RestAssured
		.given()
			.contentType("application/json")
			.header("Authorization", "Bearer a87a3c1427621f5ecc22b2d7fee8b36b5f5419dfe584dde09c73451c5ab76790")
		.when()
			.delete()
		.then()
			.statusCode(204);
		logger.info("Resource Deleted");
	}
	
}
