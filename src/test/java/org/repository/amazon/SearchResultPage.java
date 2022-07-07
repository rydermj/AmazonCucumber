package org.repository.amazon;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.amazon.BaseClass;
import org.openqa.selenium.support.CacheLookup;

public class SearchResultPage extends BaseClass  {
	
		public SearchResultPage() {
			PageFactory.initElements(driver, this);
		}
		@CacheLookup
		@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])")
		private List<WebElement> search_result;
		public List<WebElement> getSearch_result() {
			return search_result;
		}

		
}
