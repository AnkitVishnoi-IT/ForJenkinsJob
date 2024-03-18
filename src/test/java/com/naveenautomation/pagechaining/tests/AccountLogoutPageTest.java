package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.AccountLogoutPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;

public class AccountLogoutPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctPage;
	MyAccountPage myAccountPage;
	AccountLogoutPage acctLogoutPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateLogin() {
		homePage = new HomePage();
		acctPage = homePage.clickMyAccountLink();
		myAccountPage = acctPage.submitLogin("av@gmail.com", "P@ssw0rd");
		acctLogoutPage = myAccountPage.clickLogOutBtn();
		String myAccountText = acctLogoutPage.getAccountLogoutSuccessText();
		Assert.assertEquals(myAccountText.trim(), "Account Logout");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}