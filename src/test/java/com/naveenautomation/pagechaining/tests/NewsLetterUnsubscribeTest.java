package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.NewsLetterPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class NewsLetterUnsubscribeTest extends TestBase{
		HomePage homePage;
		AccountLoginPage acctLoginPage;
		MyAccountPage myAcctPage;
		NewsLetterPage newsLetterPage;

		@BeforeMethod
		public void launchBrowser() {
			initialisation();
		}

		@Test
		public void unsubscribeNewsLetter() {
			homePage = new HomePage();
			acctLoginPage = homePage.clickNewsLetterLink();
			newsLetterPage = acctLoginPage.submitLoginForNewsLetterLink("ankitv@gmail.com", "P@ssw0rd");
			myAcctPage = newsLetterPage.unsubscribeNewsLetter();
			String bannerText = myAcctPage.getSuccessBannerText();
			Assert.assertEquals(bannerText, "Success: Your newsletter subscription has been successfully updated!");
		}

//		@AfterMethod
//		public void closeBrowser() {
//			tearDown();
//		}

}
