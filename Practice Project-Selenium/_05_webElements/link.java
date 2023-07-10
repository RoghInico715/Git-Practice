package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Checking the link is enabled or not using isEnabled()
		boolean isLinkEnabled = driver.findElement(By.linkText("Forgotten password?")).isEnabled();
		System.out.println("Is Link Enabled : " + isLinkEnabled);
		
		//Get the name of the Link using getText()
		System.out.println("Link Name : " + driver.findElement(By.partialLinkText("Forgotten")).getText());
		
		//Click on the link using click()
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.quit();

	}

}
