package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class TransactionsPage extends TestBase {

	public TransactionsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement transactionsHeader;

	public String getTransactionsHeaderText() {
		return transactionsHeader.getText();
	}

}
