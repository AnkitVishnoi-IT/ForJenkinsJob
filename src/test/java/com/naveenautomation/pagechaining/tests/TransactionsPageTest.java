package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.TransactionsPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class TransactionsPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	TransactionsPage transactionsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateNewsLetterPageNavigation() {
		homePage = new HomePage();
		acctLoginPage = homePage.clickMyAccountLink();
		myAcctPage = acctLoginPage.submitLogin("av@gmail.com", "P@ssw0rd");
		transactionsPage = myAcctPage.clickTransactionsInSideNavMenu("Transactions");
		String transactionsHeaderText = transactionsPage.getTransactionsHeaderText();
		Assert.assertEquals(transactionsHeaderText.trim(), "Your Transactions");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}