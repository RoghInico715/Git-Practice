package testAnnotations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnnotations {

	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}
	@Test
	public void titleVerification() {
		
		String expectedTitle = "Instagram";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
