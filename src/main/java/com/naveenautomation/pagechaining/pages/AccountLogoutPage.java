package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;





public class AccountLogoutPage extends TestBase {

	public AccountLogoutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement accountLogoutSuccessText;

	public String getAccountLogoutSuccessText() {
		return accountLogoutSuccessText.getText();
	}
	
		
}