package in.amazon.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllBooksPage {

	private WebDriverWait wait;
	
	@FindBy(xpath = "(//section)[1]")
	private WebElement fourStarAndAbove;
	
	@FindBy(xpath = "(//div[contains(@class, 's-image-fixed-height')])[1]")
	private WebElement firstItem;
	
	public AllBooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(90));
	}
	
	public void selectFourStarAndAbove() {
		wait.until(ExpectedConditions.visibilityOfAllElements(fourStarAndAbove));
		fourStarAndAbove.click();
	}
	
	public void clickFirstItem() {
		wait.until(ExpectedConditions.visibilityOfAllElements(firstItem));
		firstItem.click();
	}
}
