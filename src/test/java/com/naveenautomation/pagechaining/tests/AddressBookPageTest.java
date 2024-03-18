package com.naveenautomation.pagechaining.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.AddAddressPage;
import com.naveenautomation.pagechaining.pages.AddressBookPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.utility.Utility;

public class AddressBookPageTest extends TestBase {
	HomePage home;
	MyAccountPage myAccountPage;
	AccountLoginPage loginPage;
	AddressBookPage addressBookPage;
	AddAddressPage addAddressPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		home = new HomePage();
	}

	@Test()
	public void validateAddNewAddress() {
		
		loginPage = home.clickMyAccountLink();
		myAccountPage =loginPage.submitLogin("av@gmail.com", "P@ssw0rd");
		addressBookPage = myAccountPage.clickAddressBookInSideNavMenu("Address Book");
		addAddressPage = addressBookPage.clickNewAddressBtn();
		addressBookPage = addAddressPage.SubmitAddress(RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(10), RandomStringUtils.randomAlphabetic(8),
				RandomStringUtils.randomAlphabetic(6), "L6Z3Y6", "Canada", "Ontario");
		String bannerText = addressBookPage.getBannerText();
		Assert.assertEquals(bannerText, "Your address has been successfully added");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}