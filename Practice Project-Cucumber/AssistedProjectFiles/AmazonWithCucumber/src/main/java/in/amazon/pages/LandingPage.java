package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	private Actions actions;
	private WebDriverWait wait;

	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signInMenu;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInButton;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public void clickMobiles() {
		mobiles.click();
	}
	
	public void hoverOverHelloSignInMenu() {
		actions.moveToElement(signInMenu).build().perform();
	}
	
	public void clickSignInButton() {
		wait.until(ExpectedConditions.elementToBeClickable(signInButton));
		signInButton.click();
	}
	
}
