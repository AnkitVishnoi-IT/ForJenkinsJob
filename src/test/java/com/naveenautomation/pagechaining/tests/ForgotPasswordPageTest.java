package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.ForgotPasswordPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ForgotPasswordPageTest extends TestBase {

	AccountLoginPage loginPage;
	ForgotPasswordPage forgotPwdPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		loginPage = new AccountLoginPage();
	}

	@Test
	public void validateForgotPwdTest() {

		forgotPwdPage = loginPage.clickForgotPwdLink();
		String forgotPwdText = forgotPwdPage.getForgotPwdPageText();
		Assert.assertEquals(forgotPwdText.trim(), "Forgot Your Password?");
	}

}
