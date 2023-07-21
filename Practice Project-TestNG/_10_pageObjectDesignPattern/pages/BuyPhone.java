package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPhone {

	@FindBy(id = "buy-now-button")
	private WebElement buyNowBtn;
	private WebDriverWait wait;
	
	public BuyPhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}

	public void clickBuyNowBtn() {
		wait.until(ExpectedConditions.visibilityOf(buyNowBtn));
		buyNowBtn.click();
		
	}
}
