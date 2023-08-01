package in.amazon.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;
import in.amazon.pages.AllBooksPage;
import in.amazon.pages.BuyBookPage;
import in.amazon.pages.LandingPage;
import in.amazon.pages.signIn;

public class Driver extends Tools {

	protected static LandingPage landingPage;
	protected static AllBooksPage allBooksPage;
	protected static BuyBookPage buyBookPage;
	protected static signIn signin;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		landingPage = new LandingPage(driver);
		allBooksPage = new AllBooksPage(driver);
		buyBookPage = new BuyBookPage(driver);
		signin = new signIn(driver);
	}
}
