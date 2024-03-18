package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.ForgotPasswordPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ForgotPasswordPageTest extends TestBase {

	HomePage home;
	AccountLoginPage loginPage;
	ForgotPasswordPage forgotPwdPage;
	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}
	

	@Test
	public void validateForgotPwdTest() {

		home = new HomePage();
		loginPage = home.clickMyAccountLink();
		forgotPwdPage = loginPage.clickForgotPwdLink();
		String forgotPwdText = forgotPwdPage.getForgotPwdPageText();
		Assert.assertEquals(forgotPwdText.trim(), "Forgot Your Password?");
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
