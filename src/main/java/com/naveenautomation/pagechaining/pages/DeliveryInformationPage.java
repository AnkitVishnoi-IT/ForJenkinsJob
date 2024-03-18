package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class DeliveryInformationPage extends TestBase {
	
		public DeliveryInformationPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(css = "#content>h1")
		WebElement deliveryInfoHeader;

		public String getDeliveryInfoHeaderText() {
			return deliveryInfoHeader.getText();
		}

	}