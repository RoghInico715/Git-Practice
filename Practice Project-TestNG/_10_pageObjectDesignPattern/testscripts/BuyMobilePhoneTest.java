package in.amazon.testscripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.signIn;

public class BuyMobilePhoneTest extends BaseTest{

	@Test
	public void buyMobile() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickMobiles();
		
		AllMobileBrands allMobileBrands = new AllMobileBrands(driver);
		allMobileBrands.hoverOverMobileAndAccessories();
		
		allMobileBrands.clickApple();
		
		ApplePhones applePhones = new ApplePhones(driver);
		applePhones.clickFirstMobile();
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		BuyPhone buyPhone = new BuyPhone(driver);
		buyPhone.clickBuyNowBtn();
		
		signIn signin = new signIn(driver);
		String expectedText = "Sign in";
		String actualText = signin.getSignInText();
		Assert.assertEquals(actualText, expectedText);
	}
	
}
