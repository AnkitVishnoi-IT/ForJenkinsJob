package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class NewAffiliateConfirmationPage extends TestBase {

	public NewAffiliateConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div#content>h1")

	WebElement newAffiliateText;

	@FindBy(css = ".pull-right>a")
	WebElement ContBtn;

	public String getNewAffiliateText() {
		return newAffiliateText.getText();
	}

}
