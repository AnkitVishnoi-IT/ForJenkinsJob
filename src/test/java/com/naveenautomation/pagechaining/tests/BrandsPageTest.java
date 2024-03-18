package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.BrandsPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class BrandsPageTest extends TestBase {

	HomePage homePage;
	BrandsPage brandsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateBrandsPageNavigation() {
		homePage = new HomePage();
		brandsPage = homePage.clickBrandsLink();
		String brandsPageHeaderText = brandsPage.getBrandsPageHeaderText();
		Assert.assertEquals(brandsPageHeaderText.trim(), "Find Your Favorite Brand");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}