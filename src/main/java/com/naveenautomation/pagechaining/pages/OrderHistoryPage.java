package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class OrderHistoryPage extends TestBase {

	public OrderHistoryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement orderHistoryHeader;

	public String getOrderHistoryHeaderText() {
		return orderHistoryHeader.getText();
	}

}
