package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		
        driver.findElement(By.id("yes")).click();
		
        driver.findElement(By.id("one")).click();
        
        driver.findElement(By.id("nobug")).click();
        
        driver.findElement(By.id("foo")).click();
        
        driver.findElement(By.id("notG")).click();

	}

}
