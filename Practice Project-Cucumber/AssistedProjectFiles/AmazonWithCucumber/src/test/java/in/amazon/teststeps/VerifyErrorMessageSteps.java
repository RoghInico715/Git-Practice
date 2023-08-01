package in.amazon.teststeps;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMessageSteps extends Driver{
	
	@Given("a user on the landing page of Amazon")
	public void a_user_on_the_landing_page_of_amazon() {
		//Long form
		//String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		//String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		//short form
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}
	
	@When("he hovers the pointer over Hello Sign-in menu")
	public void he_hovers_the_pointer_over_hello_sign_in_menu() {
		landingPage.hoverOverHelloSignInMenu();
	}

	@When("he clicks on Sign-in button in the sub-menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
		landingPage.clickSignInButton();
	}

	@When("he enters invaild email address in the Email text-bax")
	public void he_enters_invaild_email_address_in_the_email_text_bax() {
		signin.enterEmail("sampleEmail1234@gmail.com");
	}

	@When("he clicks on Continue button")
	public void he_clicks_on_continue_button() {
		signin.clickContinueBtn();
	}
	
	@Then("he must see the error message - {string}.")
	public void he_must_see_the_error_message(String string) {
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signin.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
	@When("he enters invaild email address - {string} in the Email text-box")
	public void he_enters_invaild_email_address_in_the_email_text_box(String string) {
	   signin.enterEmail(string);
	}

}
