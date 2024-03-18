package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class ContactUsCnfPage extends TestBase {

	public ContactUsCnfPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>p")
	WebElement enquirycnf;

	public String getConfirmationText() {
		return enquirycnf.getText();
	}
}
