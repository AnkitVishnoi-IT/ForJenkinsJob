package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.ContactUsPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ContactUsPageTest extends TestBase {

	HomePage homePage;
	ContactUsPage contactUsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		homePage = new HomePage();
	}

	@Test
	public void validateContactUsPageNavigation() {
		contactUsPage = homePage.ClickContactUsLink();
		String contactUsHeaderText = contactUsPage.getContactUsPageHeaderText();
		Assert.assertEquals(contactUsHeaderText.trim(), "Contact Us");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}