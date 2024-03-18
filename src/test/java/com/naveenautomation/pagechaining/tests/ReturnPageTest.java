package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.ReturnPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ReturnPageTest extends TestBase {

	HomePage homePage;
	ReturnPage returnPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateReturnPageNavigation() {
		homePage = new HomePage();
		returnPage = homePage.clickReturnsLink();
		String returnPageText = returnPage.getReturnPageText();
		Assert.assertEquals(returnPageText.trim(), "Terms & Conditions");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}