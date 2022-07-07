package org.stepdefinitions.amazon;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.repository.amazon.AddedToCartPage;
import org.repository.amazon.HomePage;
import org.repository.amazon.ProductDetailsPage;
import org.repository.amazon.SearchResultPage;
import org.utility.amazon.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	HomePage h1;
	SearchResultPage s1;
	ProductDetailsPage p1;
	AddedToCartPage a1;

	@Given("user opens google chrome and launches amazon url")
	public void user_opens_google_chrome_and_launches_amazon_url() {
		launchBrowser();
		launchUrl("https://www.amazon.in/");
		impWait();
		maxWindow();
	}

	@When("user search for a pen in the search bar")
	public void user_search_for_a_pen_in_the_search_bar() {
		h1 = new HomePage();
		WebElement search_bar = h1.getSearch_bar();
		search_bar.clear();
		search_bar.sendKeys("pen");
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		h1.getClick_searchBtn().click();
	}

	@When("In search result page user clicks on the first item")
	public void in_search_result_page_user_clicks_on_the_first_item() {
		s1 = new SearchResultPage();
		List<WebElement> search_result = s1.getSearch_result();
		search_result.get(1).click();
	}

	@Then("user will be navigated to product details page")
	public void user_will_be_navigated_to_product_details_page() {
		switchToWindow(1);

	}

	@Then("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		p1 = new ProductDetailsPage();
		p1.getClick_addToCartBtn().click();
	}

	@Test
	@Then("product should be added to cart")
	public void product_should_be_added_to_cart() {
		a1 = new AddedToCartPage();
		boolean displayed = a1.getAddedToCartText().isDisplayed();
		if (displayed == true) {
			System.out.println("Product has been added to cart");
			try {
				ss("Result");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Product not added to cart");
		}
		quit();
	}

}
