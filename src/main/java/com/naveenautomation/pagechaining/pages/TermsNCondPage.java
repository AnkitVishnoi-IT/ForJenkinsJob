package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class TermsNCondPage extends TestBase {
	
		public TermsNCondPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(css = "#content>h1")
		WebElement termsNConfHeader;

		public String getTermsNConfHeaderText() {
			return termsNConfHeader.getText();
		}

	}