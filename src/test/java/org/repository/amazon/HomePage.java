package org.repository.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.amazon.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")
	private WebElement search_input;

	@FindBy(id="nav-search-submit-button")
	private WebElement click_searchBtn;

	public WebElement getSearch_bar() {
		return search_input;
	}

	public WebElement getClick_searchBtn() {
		return click_searchBtn;
	}



}
