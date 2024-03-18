package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.ChangePwdPage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage loginPage;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		loginPage = new AccountLoginPage();
	}

	

	@Test
	public void validatePasswordUpdate() {

		// Login in
		myAccountPage = loginPage.submitLogin("mansan@gmail.com", "Password2");
		// Updating Password
		changePwdPage = myAccountPage.clickChangePasswordBtn();
		// Updating Password
		myAccountPage = changePwdPage.updatePassword("Password2", "Password2");

		String pwdAlertMessage = myAccountPage.getSuccessBannerText();

		// Asserting whether password change is successfull or not
		Assert.assertEquals("Success: Your password has been successfully updated.", pwdAlertMessage);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}