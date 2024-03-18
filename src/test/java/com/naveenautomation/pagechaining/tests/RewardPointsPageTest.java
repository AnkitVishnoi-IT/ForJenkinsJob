package com.naveenautomation.pagechaining.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.pagechaining.pages.AccountLoginPage;
import com.naveenautomation.pagechaining.pages.HomePage;
import com.naveenautomation.pagechaining.pages.MyAccountPage;
import com.naveenautomation.pagechaining.pages.RewardPointsPage;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class RewardPointsPageTest extends TestBase {

	HomePage homePage;
	AccountLoginPage acctLoginPage;
	MyAccountPage myAcctPage;
	RewardPointsPage rewardPointsPage;

	@BeforeMethod
	public void launchBrowser() {
		initialisation();
	}

	@Test
	public void validateNewsLetterPageNavigation() {
		homePage = new HomePage();
		acctLoginPage = homePage.clickMyAccountLink();
		myAcctPage = acctLoginPage.submitLogin("ankitv@gmail.com", "P@ssw0rd");
		rewardPointsPage = myAcctPage.clickRewardPointsInSideNavMenu("Reward Points");
		String rewardPointsHeaderText = rewardPointsPage.getRewardPointsHeaderText();
		Assert.assertEquals(rewardPointsHeaderText.trim(), "Your Reward Points");
	}

//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

}