package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class RewardPointsPage extends TestBase {

	public RewardPointsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement rewardPointsHeader;

	public String getRewardPointsHeaderText() {
		return rewardPointsHeader.getText();
	}

}
