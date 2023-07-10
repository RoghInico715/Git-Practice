package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editText {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		//Enter values in the Edit Text
		driver.findElement(By.id("email")).sendKeys("sampleemail123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sample-1234");
		
		//Checking the EditText is enabled or not
		boolean isEditTextEnabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println("Is EditText Enabled : " + isEditTextEnabled);
		
		//Get the values entered in the EditText
		System.out.println("Email ID : " + driver.findElement(By.id("email")).getAttribute("value"));
		System.out.println("Password : " + driver.findElement(By.id("pass")).getAttribute("value"));
		
		//Clear the values entered in the EditText
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
		
		driver.quit();
		
	}

}
