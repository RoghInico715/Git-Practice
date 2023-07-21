package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMobileBrands {

	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(linkText = "Mobiles & Accessories")
	private WebElement mobilesAndAccessories;
	
	@FindBy(linkText = "Apple")
	private WebElement apple;
	
	public AllMobileBrands(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public void hoverOverMobileAndAccessories() {
		actions.moveToElement(mobilesAndAccessories).build().perform();
	}
	
	public void clickApple() {
	    wait.until(ExpectedConditions.visibilityOf(apple));
		apple.click();
	}
}
