package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class ReturnCnfPage extends TestBase {

	public ReturnCnfPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>p:first-of-type")
	WebElement returnCnfText;

	public String getReturnCnfText() {
		return returnCnfText.getText();
	}

}
