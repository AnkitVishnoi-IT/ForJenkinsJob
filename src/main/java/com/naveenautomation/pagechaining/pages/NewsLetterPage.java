package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class NewsLetterPage extends TestBase {

	public NewsLetterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement newsLetterHeader;

	public String getNewsLetterHeaderText() {
		return newsLetterHeader.getText();
	}

	@FindBy(css = "input[type='radio'][value='1']")
	WebElement yesRadioBtn;
	
	@FindBy(css = "input[type='radio'][value='0']")
	WebElement noRadioBtn;
	
	@FindBy(css = "[type = 'submit'][value='Continue']")
	WebElement continueBtn;

	@FindBy(css = ".row>#content .pull-left")
	WebElement backBtn;
	
	public MyAccountPage subscribeNewsLetter() {
		yesRadioBtn.click();
		continueBtn.click();
		return new MyAccountPage();
	}
	
	public MyAccountPage unsubscribeNewsLetter() {
		noRadioBtn.click();
		continueBtn.click();
		return new MyAccountPage();
	}
		
	
	
	
}
