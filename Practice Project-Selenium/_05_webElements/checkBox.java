package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
		    
		 driver.manage().window().maximize();
			
		 driver.get("https://letcode.in/radio");
		 
		 //Checking the checkBox is already selected using isSelected()
		 boolean checkBoxIsSelected = driver.findElement(By.xpath("(//input[contains(@type, 'checkbox')])[1]")).isSelected();
		 System.out.println("Is CheckBox Selected : " + checkBoxIsSelected);
		 
		//Checking the checkBox is enabled or not using isEnabled()
		 boolean checkBoxIsEnabled = driver.findElement(By.xpath("(//input[contains(@type, 'checkbox')])[1]")).isEnabled();
		 System.out.println("Is CheckBox Enabled : " + checkBoxIsEnabled);
		 
		 //Unselect the "remember me" checkBox
		 driver.findElement(By.xpath("(//input[contains(@type, 'checkbox')])[1]")).click();
		 
		 //Select the " I agree" checkBox
		 driver.findElement(By.xpath("(//input[contains(@type, 'checkbox')])[2]")).click();
	}

}
