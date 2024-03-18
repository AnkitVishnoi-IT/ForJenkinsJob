package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class AffiliateRegisterationPage extends TestBase {

	public AffiliateRegisterationPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "input-firstname")
	// is better for maintenance purpose
	WebElement firstNameInput;
	@FindBy(id = "input-lastname")
	WebElement lastNameInput;
	@FindBy(id = "input-email")
	WebElement emailInput;
	@FindBy(id = "input-telephone")
	WebElement phoneInput;
	@FindBy(id = "input-company")
	WebElement companyInput;
	@FindBy(id = "input-website")
	WebElement websiteInput;
	@FindBy(id = "input-tax")
	WebElement taxInput;
	@FindBy(css = "[type='radio'][value='cheque']")
	WebElement paymentMethodRadioBtn;
	@FindBy(id = "input-cheque")
	WebElement chequeInput;
	@FindBy(id = "input-password")
	WebElement passwordInput;
	@FindBy(id = "input-confirm")
	WebElement pswdConfirmationInput;
	@FindBy(css = "[type = 'checkbox'][value='1']")
	WebElement agreeCheckBox;
	@FindBy(css = "[type='submit'][value='Continue']")
	WebElement continueBtn;

	private void enterFirstName(String firstName) {
		firstNameInput.sendKeys(firstName);
	}

	private void enterLastName(String lastName) {
		lastNameInput.sendKeys(lastName);
	}

	private void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	private void enterPhone(String phone) {
		phoneInput.sendKeys(phone);
	}

	private void enterCompanyName(String companyName) {
		companyInput.sendKeys(companyName);
	}

	private void enterWebSite(String webSite) {
		websiteInput.sendKeys(webSite);
	}

	private void enterTaxId(String taxId) {
		taxInput.sendKeys(taxId);
	}

	private void clickPaymentMethodRadioBtn() {
		paymentMethodRadioBtn.click();
	}

	private void enterChequePayee(String chequePayeeName) {
		chequeInput.sendKeys(chequePayeeName);
	}

	private void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	private void confirmPassword(String password) {
		pswdConfirmationInput.sendKeys(password);
	}

	private void clickAgreeCheckBox() {
		agreeCheckBox.click();
	}

	private void clickSubmitBtn() {
		continueBtn.click();
	}

	public NewAffiliateConfirmationPage registerAffiliatet(String firstName, String lastName, String email,
			String phone, String companyName, String webSite, String taxId, String chequePayeeName, String password) {
		enterFirstName(firstName);
		enterLastName(lastName);
		enterEmail(email);
		enterPhone(phone);
		enterCompanyName(companyName);
		enterWebSite(webSite);
		enterTaxId(taxId);
		clickPaymentMethodRadioBtn();
		enterChequePayee(chequePayeeName);
		enterPassword(password);
		confirmPassword(password);
		clickAgreeCheckBox();
		clickSubmitBtn();
		return new NewAffiliateConfirmationPage();
	}

}
