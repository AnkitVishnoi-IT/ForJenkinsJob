package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.DeliveryInformationPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class DeliveryInformationPageTest extends TestBase {

	HomePage homePage;
	DeliveryInformationPage deliveryInfoPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateDeliveryInfoPageNavigation() {
		homePage = new HomePage();
		deliveryInfoPage = homePage.clickDeliveryInformationLink();
		String deliveryInfoHeaderText = deliveryInfoPage.getDeliveryInfoHeaderText();
		Assert.assertEquals(deliveryInfoHeaderText.trim(), "Delivery Information");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}