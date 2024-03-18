package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.SpecialOfferPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class SpecialOfferPageTest extends TestBase {

	HomePage homePage;
	SpecialOfferPage specialsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateSpecialsPageNavigation() {
		homePage = new HomePage();
		specialsPage = homePage.clickSpecialsLink();
		String specialsPageHeaderText = specialsPage.getSpecialsPageHeaderText();
		Assert.assertEquals(specialsPageHeaderText.trim(), "Special Offers");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}