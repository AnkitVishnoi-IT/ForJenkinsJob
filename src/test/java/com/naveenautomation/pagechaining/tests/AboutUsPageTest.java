package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AboutUsPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class AboutUsPageTest extends TestBase {

	HomePage homePage;
	AboutUsPage aboutUsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();

	}

	@Test
	public void validateAboutUsPageNavigation() {
		homePage = new HomePage();
		aboutUsPage = homePage.clickAboutUsLink();
		String aboutUsHeaderText = aboutUsPage.getAboutUsHeaderText();
		Assert.assertEquals(aboutUsHeaderText.trim(), "About Us");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}