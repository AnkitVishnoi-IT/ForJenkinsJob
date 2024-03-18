package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class MyAccountInformationPage extends TestBase {

	public MyAccountInformationPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-firstname")
	private WebElement firstName;

	@FindBy(id = "input-lastname")
	private WebElement lastName;

	@FindBy(id = "input-email")
	private WebElement email;

	@FindBy(id = "input-telephone")
	private WebElement phone;

	@FindBy(css = "[type ='submit']")
	private WebElement submitBtn;

	
	private void editFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}

	private void editLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}

	private void editPhoneNum(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}

	private void editEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);

	}

	private void clickSubmitBtn() {
		submitBtn.submit();
	}

	public MyAccountPage editAccountInfo(String firstName, String lastName, String phone, String email) {
		editFirstName(firstName);
		editLastName(lastName);
		editPhoneNum(phone);
		editEmail(email);
		clickSubmitBtn();
		return new MyAccountPage();
	}
}
