package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.DesktopPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.HpLP3065Page;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class HpLP3065PageTest extends TestBase {
	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	DesktopPage desktopPage;
	HpLP3065Page hpPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();

	}

	@Test(enabled = false)

	public void validateProductAddedToCart() {
		acctLoginPage = homePage.clickNewsLetterLink();
		myAcctPage = acctLoginPage.submitLogin("ankitv@gmail.com", "P@ssw0rd");
		desktopPage = myAcctPage.clickShowAllDesktop("Desktop");
		hpPage = desktopPage.clickOnDesktop();
		String hpPageHeaderText = hpPage.clickOnaddToCartButton();
		Assert.assertEquals(hpPageHeaderText, hpPageHeaderText);

	}

}
