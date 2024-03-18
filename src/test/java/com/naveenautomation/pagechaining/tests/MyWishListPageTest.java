package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.MyWishListPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class MyWishListPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	MyWishListPage wishListPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateNewsLetterPageNavigation() {
		homePage = new HomePage();
		acctLoginPage = homePage.clickWishListLink();
		wishListPage = acctLoginPage.submitLoginForWishListLink("ankitv@gmail.com", "P@ssw0rd");
		String wishListHeaderText = wishListPage.getMyWishListHeaderText();
		Assert.assertEquals(wishListHeaderText.trim(), "My Wish List");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}