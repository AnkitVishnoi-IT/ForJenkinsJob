package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class MyWishListPage extends TestBase {

	public MyWishListPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h2")
	WebElement myWishListHeader;

	public String getMyWishListHeaderText() {
		return myWishListHeader.getText();
	}

}
