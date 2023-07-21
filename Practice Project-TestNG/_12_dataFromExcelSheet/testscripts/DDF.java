package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.signIn;
import utils.ReadExcel;

public class DDF extends BaseTest{

	@Test
	public void verifyErrorMsg() throws IOException {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoverOverHelloSignInMenu();
		
		landingPage.clickSignInButton();
		
		String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		
		for(int i=1; i<6 ; i++) {
			String username = data[i][1];
			signIn signin = new signIn(driver);
			signin.enterEmail(username);
		
			signin.clickContinueBtn();
		
			String expectedErrMsg = "We cannot find an account with that email address";
			String actualErrMsg = signin.getErrMsg();
			Assert.assertEquals(actualErrMsg, expectedErrMsg);
		}
	}
}
