package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathForComplex {

	public static void main(String[] args) {

ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Here we used the xpath with contains() to locate the web-element
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("sampleemail123@gmail.com");
		
		//Here we used the xpath with starts-with() to locate the web-element
		driver.findElement(By.xpath("//*[starts-with(@type, 'p')]")).sendKeys("sample-1234");
		
		//Here we used the xpath with contains() to locate the web-element
		driver.findElement(By.xpath("//button[contains(@name, 'login')]")).click();
		
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		
		//Here we used the xpath following to locate the web-element
		String actualErrMsg = driver.findElement(By.xpath("(//div[@id=\"email_container\"]//following::div)[2]")).getText();
		
		if (expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.quit();
	}

}
