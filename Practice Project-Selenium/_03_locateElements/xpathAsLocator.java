package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAsLocator {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Here we used the xpath to locate the web-element
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("sampleemail123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("sample-1234");		
		driver.findElement(By.xpath("//button[contains(@name, 'login')]")).click();
		
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		
		//Here we used the xpath to locate the web-element
		String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class, 'ay')])[3]")).getText();
		
		if (expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.quit();

	}

}
