package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class idAsLocator {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Here we used the ID to locate the web-element
		driver.findElement(By.id("email")).sendKeys("sampleemail123@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("sample-1234");
		
		driver.findElement(By.name("login")).click();
		
	}
}
