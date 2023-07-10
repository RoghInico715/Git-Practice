package automateCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateCalender {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	    
		 driver.manage().window().maximize();
			
		 driver.get("https://www.expedia.co.in/");
		 
		 //Automating to select the Check-in date
		 driver.findElement(By.cssSelector("#d1-btn")).click();
		 
		 WebElement nextmonth = driver.findElement(By.xpath("(//table[contains(@class, 'weeks')])[2]"));
		 
		 List<WebElement> rows = nextmonth.findElements(By.tagName("tr"));
		 
		 for (int i=1; i<rows.size(); i++) {
			 WebElement row = rows.get(i);
			 List<WebElement> columns = row.findElements(By.tagName("button"));
			 
			 for (WebElement x : columns) {
				 if(x.getAttribute("data-day").equals("9")) {
					 x.click();
					 break;
				 }
			 }
		 }
		 
		 driver.findElement(By.xpath("//button[contains(@data-stid, 'apply-date')]")).click();
		 
		//Automating to select the Check-out date
         driver.findElement(By.cssSelector("#d2-btn")).click();
		 
		 WebElement nextmonth2 = driver.findElement(By.xpath("(//table[contains(@class, 'weeks')])[1]"));
		 
		 List<WebElement> rows2 = nextmonth2.findElements(By.tagName("tr"));
		 
		 for (int i=1; i<rows.size(); i++) {
			 WebElement row2 = rows2.get(i);
			 List<WebElement> columns2 = row2.findElements(By.tagName("button"));
			 
			 for (WebElement x : columns2) {
				 if(x.getAttribute("data-day").equals("10")) {
					 x.click();
					 break;
				 }
			 }
		 }
		 
		 driver.findElement(By.xpath("//button[contains(@data-stid, 'apply-date')]")).click();
		 

	}

}
