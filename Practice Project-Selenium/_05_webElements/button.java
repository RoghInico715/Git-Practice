package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("sampleemail123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sample-1234");
		
		//Checking the Button is enabled or not using isEnabled()
		boolean isButtonEnabled = driver.findElement(By.name("login")).isEnabled();
		System.out.println("Is Button Enabled : " + isButtonEnabled);
		
		//Checking the Button is enabled or not using isEnabled()
		boolean isButtonDisplayed = driver.findElement(By.name("login")).isDisplayed();
		System.out.println("Is Button Displayed : " + isButtonDisplayed);
		
		//Click on the link using click()
		driver.findElement(By.name("login")).click();
				
		driver.quit();

	}

}
