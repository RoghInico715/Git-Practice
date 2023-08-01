package in.amazon.teststeps;

import java.util.ArrayList;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyPhysicsBooksSteps extends Driver{

	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
	    
	}

	@When("he enters physics books in the search box")
	public void he_enters_physics_books_in_the_search_box() {
		landingPage.enterSearchBox("physics books");
	}

	@When("he selects the 3rd option from the drop-down list")
	public void he_selects_the_3rd_option_from_the_drop_down_list() {
		landingPage.searchItem();
	}

	@When("he select rating 4star and above from left side bar")
	public void he_select_rating_4star_and_above_from_left_side_bar() {
		allBooksPage.selectFourStarAndAbove();
	}

	@When("he clicks on the first search result")
	public void he_clicks_on_the_first_search_result() {
		allBooksPage.clickFirstItem();
	}

	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on Add to Cart button")
	public void he_clicks_on_add_to_cart_button() {
		buyBookPage.clickAddToCartBtn();
	}

	@When("he verify the text - {string} is displayed")
	public void he_verify_the_text_is_displayed(String string) {
		String expectedText = "Added to Cart";
		String actualText = buyBookPage.getAddedToCartText();
		Assert.assertEquals(actualText, expectedText);
	}

	@When("he clicks on Proceed to Buy button")
	public void he_clicks_on_proceed_to_buy_button() {
	   buyBookPage.clickproceedToBuyBtn();
	}

	@Then("he must be able to purchase the book successfully.")
	public void he_must_be_able_to_purchase_the_book_successfully() {
		String expectedText = "Sign in";
		String actualText = signin.getSignInText();
		Assert.assertEquals(actualText, expectedText);
	}

}
