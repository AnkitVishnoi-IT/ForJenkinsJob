package com.naveenautomation.pagechaining.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;


public class AboutUsPage extends TestBase {

	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement aboutUsHeader;

	public String getAboutUsHeaderText() {
		return aboutUsHeader.getText();
	}

}