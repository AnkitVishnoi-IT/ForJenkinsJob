package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.NewsLetterPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class NewsLetterPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	NewsLetterPage newsLetterPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateNewsLetterPageNavigation() {
		homePage = new HomePage();
		acctLoginPage = homePage.clickNewsLetterLink();
		newsLetterPage = acctLoginPage.submitLoginForNewsLetterLink("ankitv@gmail.com", "P@ssw0rd");
		String newsLetterHeaderText = newsLetterPage.getNewsLetterHeaderText();
		Assert.assertEquals(newsLetterHeaderText.trim(), "Newsletter Subscription");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}