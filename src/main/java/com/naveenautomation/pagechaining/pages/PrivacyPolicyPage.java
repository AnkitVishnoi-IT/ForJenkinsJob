package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class PrivacyPolicyPage extends TestBase {
	
		public PrivacyPolicyPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(css = "#content>h1")
		WebElement privacyPolicyHeader;

		public String getPrivacyPolicyHeaderText() {
			return privacyPolicyHeader.getText();
		}

	}