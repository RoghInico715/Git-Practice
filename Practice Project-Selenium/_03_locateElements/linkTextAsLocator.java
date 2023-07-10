package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextAsLocator {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Here we used the link text to locate the web-element
		driver.findElement(By.linkText("Forgotten password?")).click();

	}

}
