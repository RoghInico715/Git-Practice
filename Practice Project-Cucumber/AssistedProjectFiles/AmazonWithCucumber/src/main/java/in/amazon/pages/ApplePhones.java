package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplePhones {
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class, 'card-container')])[2]")
	private WebElement secondMobile;

	public ApplePhones(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}

	public void clickSecondMobile() {
		 wait.until(ExpectedConditions.elementToBeClickable(secondMobile));
		 secondMobile.click();
	}

}
