package org.repository.amazon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.amazon.BaseClass;


public class ProductDetailsPage extends BaseClass{
	public ProductDetailsPage() {
		PageFactory.initElements(driver, this);

	}
	@CacheLookup
	@FindBy(id="add-to-cart-button")
	private WebElement click_addToCartBtn;
	public WebElement getClick_addToCartBtn() {
		return click_addToCartBtn;
	}


}
