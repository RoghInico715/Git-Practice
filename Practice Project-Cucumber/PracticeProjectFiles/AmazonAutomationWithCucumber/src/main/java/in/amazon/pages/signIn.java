package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signIn {

	@FindBy(xpath = "//h1[contains(@class, 'small')]")
	private WebElement signInText;
	
	
	public signIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSignInText() {
		String text  = signInText.getText();
		return text;
	}
	
}
