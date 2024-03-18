package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class ContactUsPage extends TestBase {

	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-name")
	WebElement nameInputBox;

	@FindBy(id = "input-email")
	WebElement emailInputBox;

	@FindBy(id = "input-enquiry")
	WebElement enquiryInputBox;

	@FindBy(css = "[type ='submit']")
	WebElement submitBtn;

	@FindBy(css = "#content>p")
	WebElement enquirycnf;

	@FindBy(css = "#content h1")
	WebElement contactUsPageHeader;

	public String getContactUsPageHeaderText() {
		return contactUsPageHeader.getText();

	}

	public ContactUsCnfPage enterEnquiry(String name, String email, String enquiry) {
		nameInputBox.sendKeys(name);
		emailInputBox.sendKeys(email);
		enquiryInputBox.sendKeys(enquiry);
		submitBtn.submit();
		return new ContactUsCnfPage();
	}

}