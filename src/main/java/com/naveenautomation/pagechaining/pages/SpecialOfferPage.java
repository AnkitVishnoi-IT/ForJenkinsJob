package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class SpecialOfferPage extends TestBase {

	public SpecialOfferPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h2")
	WebElement specialsPageHeader;

	public String getSpecialsPageHeaderText() {
		return specialsPageHeader.getText();
	}

}
