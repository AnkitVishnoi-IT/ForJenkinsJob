package com.naveenautomation.pagechaining.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.NewAccountConfirmationPage;
import com.naveenautomation.pagechaining.pages.RegisterAccountPage;
import com.naveenautomation.pagechaining.testbase.TestBase;
import com.naveenautomation.pagechaining.utility.Utility;

public class RegisterAccountPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	RegisterAccountPage newRegistration;
	NewAccountConfirmationPage newActCfmPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
		homePage = new HomePage();
	}

	@Test
	public void validateRegistration() {
		
		homePage = new HomePage();
		acctLoginPage = homePage.clickMyAccountLink();
		newRegistration = acctLoginPage.clickRegisterationBtn();

//		newActCfmPage = newRegistration.registerAccount(Utility.generateRandomString(6), Utility.generateRandomString(6), Utility.generateRandomPh(), Utility.generateRandomEmail(), "P@ssword1");
//			above is giving unknown error: msedgedriver only supports characters in the BMP

		newActCfmPage = newRegistration.registerAccount(RandomStringUtils.randomAlphabetic(5),
				RandomStringUtils.randomAlphabetic(5), RandomStringUtils.randomNumeric(10),
				RandomStringUtils.randomAlphabetic(5) + "@gmail.com", "P@ssword1");
		String newAccountText = newActCfmPage.getNewAccountText();
		Assert.assertEquals(newAccountText.trim(), "Your Account Has Been Created!");
	}
}
