package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameAsLocator {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Here we used the name to locate the web-element
		driver.findElement(By.name("email")).sendKeys("sampleemail123@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("sample-1234");
		
		driver.findElement(By.name("login")).click();
	}
}
