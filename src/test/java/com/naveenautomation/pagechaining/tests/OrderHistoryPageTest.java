package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.OrderHistoryPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class OrderHistoryPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	OrderHistoryPage orderHistoryPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateNewsLetterPageNavigation() {
		homePage = new HomePage();
		acctLoginPage = homePage.clickOrderHistoryLink();
		orderHistoryPage = acctLoginPage.submitLoginForOrderHistoryLink("ankitv@gmail.com", "P@ssw0rd");
		String orderHistoryHeaderText = orderHistoryPage.getOrderHistoryHeaderText();
		Assert.assertEquals(orderHistoryHeaderText.trim(), "Order History");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}