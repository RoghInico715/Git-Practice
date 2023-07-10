package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

    public static void main(String[] args) throws InterruptedException {
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	    
	    //Getting into the frame to access its elements
	    driver.switchTo().frame("classFrame");
	    
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("TREE")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("DEPRECATED")).click();
	    
    }
}
