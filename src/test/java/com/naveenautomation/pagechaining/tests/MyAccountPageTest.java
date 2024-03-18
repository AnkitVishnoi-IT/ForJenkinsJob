package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.ChangePwdPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		homePage = new HomePage();
	}

	

	@Test
	public void validatePasswordUpdate() {

		// Login in
		acctLoginPage = homePage.clickMyAccountLink();
		myAccountPage = acctLoginPage.submitLogin("ankitv@gmail.com", "P@ssw0rd");
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