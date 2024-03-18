package com.naveenautomation.pagechaining.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.AffiliateLoginPage;
import com.naveenautomation.pagechaining.pages.AffiliateRegisterationPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.NewAffiliateConfirmationPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class RegisterAffiliatePageTest extends TestBase {

	HomePage homePage;
	AffiliateLoginPage affiliateLogin;
	AffiliateRegisterationPage newAffiliate;
	NewAffiliateConfirmationPage newAffiliateCfmPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		homePage = new HomePage();
	}

	@Test
	public void validateRegistration() {

		affiliateLogin = homePage.clickAffiliateLink();
		newAffiliate = affiliateLogin.clickRegisterationBtn();

		newAffiliateCfmPage = newAffiliate.registerAffiliatet(RandomStringUtils.randomAlphabetic(5),
				RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomAlphabetic(5) + "@gmail.com",
				RandomStringUtils.randomNumeric(10), RandomStringUtils.randomAlphabetic(6), "www.google.com",
				RandomStringUtils.randomNumeric(4), RandomStringUtils.randomAlphabetic(5), "Password");
		String newAffiliateText = newAffiliateCfmPage.getNewAffiliateText();
		Assert.assertEquals(newAffiliateText.trim(), "Your Affiliate Account Has Been Created!");
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
