package in.amazon.restAssuredDemo;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class APIKeyDemo {

	@Test
	public void getWeatherInfo() {
		RestAssured
			.given()
				.param("q", "chennai")
				.param("appid", "241af1738a9aca9af5cbbb77d330d4a8")
			.when()
				.get("https://api.openweathermap.org/data/2.5/weather")
			.then()
				.statusCode(200)
				.log().all();
	}
}
