package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.ReturnCnfPage;
import com.naveenautomation.pagechaining.pages.ReturnPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class ReturnCnfPageTest extends TestBase {

	HomePage homePage;
	ReturnPage retunpage;
	ReturnCnfPage returnCnfPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		homePage = new HomePage();
	}

	@Test
	public void validateReturnSubmission() {

		homePage = new HomePage();
		retunpage = homePage.clickReturnsLink();
		returnCnfPage = retunpage.submitReturnDetails();

		String returnCnfText = returnCnfPage.getReturnCnfText();
		Assert.assertEquals(returnCnfText.trim(), "Thank you for submitting your return request. Your request has been sent to the relevant department for processing.");
	}
}
