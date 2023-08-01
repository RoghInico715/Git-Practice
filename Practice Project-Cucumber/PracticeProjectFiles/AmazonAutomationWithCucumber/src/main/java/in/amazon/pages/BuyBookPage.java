package in.amazon.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyBookPage {

	private WebDriverWait wait;
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartBtn;
	
	@FindBy(id = "NATC_SMART_WAGON_CONF_MSG_SUCCESS")
	private WebElement addedToCartText;
	
	@FindBy(xpath = "//input[contains(@name, 'proceedToRetailCheckout')]")
	private WebElement proceedToBuyBtn;
	
	public BuyBookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}
	
	public String getAddedToCartText() {
		String text  = addedToCartText.getText();
		return text;
	}
	
	public void clickproceedToBuyBtn() {
		wait.until(ExpectedConditions.visibilityOfAllElements(proceedToBuyBtn));
		proceedToBuyBtn.click();
	}
}
