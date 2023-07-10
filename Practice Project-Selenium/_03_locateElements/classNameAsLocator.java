package locateElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class classNameAsLocator {

public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	
	//Here we used the class-name to locate the web-element
	driver.findElement(By.className("example")).click();
	

	}
}
