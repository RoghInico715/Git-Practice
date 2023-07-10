package webElements;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchingTabs {

public static void main(String[] args) throws InterruptedException {
		
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Instagram")).click();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("sample123@gmail.com");

	}
}
