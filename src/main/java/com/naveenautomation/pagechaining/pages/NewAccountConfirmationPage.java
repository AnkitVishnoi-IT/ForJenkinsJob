package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class NewAccountConfirmationPage extends TestBase {

	public NewAccountConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div#content>h1")

	WebElement newAccountText;

	@FindBy(css = ".pull-right>a")
	WebElement ContBtn;

	public String getNewAccountText() {
		return newAccountText.getText();
	}

}
