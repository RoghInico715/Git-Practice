package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class explicitWait {

	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
        driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	}
	@Test
	public void verifyText() {

		driver.findElement(By.id("start")).click();
		String expectedText = "Hello World!";
		int sec = 60;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		Assert.assertEquals(actualText, expectedText);
		 
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
