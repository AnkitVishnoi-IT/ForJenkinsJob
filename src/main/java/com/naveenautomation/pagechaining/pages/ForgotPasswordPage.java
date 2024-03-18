package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class ForgotPasswordPage  extends TestBase {
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "div#content>h1")
	
	WebElement forgotPwdPageText;
	
	@FindBy(css = ".pull-right>a")
	WebElement ContBtn;
	
	@FindBy(css = ".pull-left>a")
	WebElement BackBtn;
	
	public String getForgotPwdPageText() {
		return forgotPwdPageText.getText();
	}

}
