package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;

public class AccountLoginPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateLogin() {
		page = new AccountLoginPage();
		myAccountPage = page.submitLogin("ankitv@gmail.com", "P@ssw0rd");
		String myAccountText = myAccountPage.getMyAccountText();
		Assert.assertEquals(myAccountText.trim(), "My Account");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}