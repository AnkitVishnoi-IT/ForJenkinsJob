package com.naveenautomation.pagechaining.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.GiftCertificatesPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class GiftCertificatesPageTest extends TestBase {

	HomePage homePage;

	GiftCertificatesPage giftPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();

		homePage = new HomePage();
		giftPage = homePage.clickGiftCertificatesLink();
	}

	@Test
	public void validateGiftCertificateBtnClickTest() {

		String giftPageHeaderText = giftPage.getGiftPageHeaderText();
		Assert.assertEquals(giftPageHeaderText, "Purchase a Gift Certificate",
				"Text on the Gift Certificate Purchase Page did not match");
	}

	@Test
	public void validateGiftCertificatePurchase() {

		giftPage.submitGiftPurchaseDetails(RandomStringUtils.randomAlphabetic(6),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", RandomStringUtils.randomAlphabetic(6),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", "Testing Gift Certificate ",
				RandomStringUtils.randomNumeric(2));
		String giftPurchaseConfirmationText = giftPage.getGiftPurchaseConfirmationText();
		Assert.assertEquals(giftPurchaseConfirmationText.trim(),
				"Thank you for purchasing a gift certificate! Once you have completed your order your gift certificate recipient will be sent an e-mail with details how to redeem their gift certificate.",
				"Test Failed - Gift Purchase Confirmation Message did not match.");

	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}