package in.amazon.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import in.amazon.pages.LandingPage;
import in.amazon.pages.signIn;

public class verifyErrorMessageTest extends BaseTest{
	
	@Test
	public void verifyErrorMsg() {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoverOverHelloSignInMenu();
		
		landingPage.clickSignInButton();
		
		signIn signin = new signIn(driver);
		signin.enterEmail("sampleEmail1234@gmail.com");
		
		signin.clickContinueBtn();
		
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signin.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
}
