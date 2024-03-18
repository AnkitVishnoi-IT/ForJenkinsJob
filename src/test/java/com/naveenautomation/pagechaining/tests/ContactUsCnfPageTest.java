package com.naveenautomation.pagechaining.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.ContactUsCnfPage;
import com.naveenautomation.pagechaining.pages.ContactUsPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ContactUsCnfPageTest extends TestBase {

	HomePage homePage;
	ContactUsPage contactUsPage;
	ContactUsCnfPage contactUsCnfPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();

	}

	@Test
	public void validateEnquirySubmission() {
		homePage = new HomePage();
		contactUsPage = homePage.ClickContactUsLink();
		;
		contactUsCnfPage = contactUsPage.enterEnquiry(RandomStringUtils.randomAlphabetic(6),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(15));
		String contactUsCnfText = contactUsCnfPage.getConfirmationText();
		Assert.assertEquals(contactUsCnfText.trim(), "Your enquiry has been successfully sent to the store owner!");
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
