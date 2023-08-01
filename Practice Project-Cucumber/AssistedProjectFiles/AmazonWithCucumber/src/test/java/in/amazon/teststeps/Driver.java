package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;
import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.signIn;
import utils.Tools;

public class Driver extends Tools {

	protected static LandingPage landingPage;
	protected static AllMobileBrands allMobileBrands;
	protected static ApplePhones applePhones;
	protected static BuyPhone buyPhone;
	protected static signIn signin;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		landingPage = new LandingPage(driver);
		allMobileBrands = new AllMobileBrands(driver);
		applePhones = new ApplePhones(driver);
		buyPhone = new BuyPhone(driver);
		signin = new signIn(driver);
	}
}
