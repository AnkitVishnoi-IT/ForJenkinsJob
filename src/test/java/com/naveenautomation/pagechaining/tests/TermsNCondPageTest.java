package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.TermsNCondPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class TermsNCondPageTest extends TestBase {

	HomePage homePage;
	TermsNCondPage termsNCondPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateContactUsPageNavigationTermsNCondPageNavigation() {
		homePage = new HomePage();
		termsNCondPage = homePage.clickTermsNCondLink();
		String termsNConfText = termsNCondPage.getTermsNConfHeaderText();
		Assert.assertEquals(termsNConfText.trim(), "Terms & Conditions");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}