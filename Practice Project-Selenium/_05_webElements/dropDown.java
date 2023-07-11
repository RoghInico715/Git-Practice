package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

   public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		//select apple in the Fruits list
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select_1 = new Select(fruits);
		select_1.selectByVisibleText("Apple");
		
		//select java in the Language list
		WebElement languages = driver.findElement(By.id("lang"));
		Select select_2 = new Select(languages);
		select_2.selectByVisibleText("Java");
		
		//select java in the Country list
		WebElement countries = driver.findElement(By.id("country"));
		Select select_3 = new Select(countries);
		select_3.selectByVisibleText("India");


	}
}
