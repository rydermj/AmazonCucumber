package org.repository.amazon;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.amazon.BaseClass;


public class AddedToCartPage extends BaseClass{
	public AddedToCartPage() {
		PageFactory.initElements(driver, this);

	}
	@CacheLookup
	@FindBy(xpath="//span[text()[normalize-space()='Added to Cart']]")
	private WebElement addedToCartText;
	public WebElement getAddedToCartText() {
		return addedToCartText;
	}


}
