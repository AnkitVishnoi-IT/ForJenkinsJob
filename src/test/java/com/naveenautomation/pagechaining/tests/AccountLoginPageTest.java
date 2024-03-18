package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class AccountLoginPageTest extends TestBase {

	HomePage home;
	MyAccountPage myAccountPage;
	AccountLoginPage loginPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}
	
	@Test
	public void validateLogin() {
		home = new HomePage();
		loginPage = home.clickMyAccountLink();
		myAccountPage =loginPage.submitLogin("ankitv@gmail.com", "P@ssw0rd");
		String myAccountText = myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText.trim(), "My Account");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}