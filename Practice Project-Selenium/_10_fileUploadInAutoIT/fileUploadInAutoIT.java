package fileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUploadInAutoIT {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.freepdfconvert.com/jpg-to-pdf");
		
		driver.findElement(By.xpath("//a[contains(@class, 'btn-wrapper upload-btn')]")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("resources//fileUpload.exe");

	}

}
