package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.SiteMapPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class SiteMapPageTest extends TestBase {

	HomePage homePage;
	SiteMapPage siteMapPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateSiteMapPageNavigation() {
		homePage = new HomePage();
		siteMapPage = homePage.clickSiteMapLink();
		String siteMapHeaderText = siteMapPage.getSiteMapHeaderText();
		Assert.assertEquals(siteMapHeaderText.trim(), "Site Map");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}