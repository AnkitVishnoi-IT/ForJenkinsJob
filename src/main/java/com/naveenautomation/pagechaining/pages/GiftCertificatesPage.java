package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class GiftCertificatesPage extends TestBase {

	public GiftCertificatesPage() {
		PageFactory.initElements(driver, this); // this method is defined inside the constructor to initialize all the
												// elements of the current class object.
	}

	@FindBy(id = "input-to-name")
	WebElement recipientNameInputBox;

	@FindBy(id = "input-to-email")
	WebElement recipientEmailInputBox;

	@FindBy(id = "input-from-name")
	WebElement senderNameInputBox;

	@FindBy(id = "input-from-email")
	WebElement senderEmailInputBox;

	@FindBy(css = "[name='voucher_theme_id'][value='7']")
	WebElement voucherThemeRadioBtn;

	@FindBy(id = "input-message")
	WebElement msgInputBox;

	@FindBy(id = "input-amount")
	WebElement amountInputBox;

	@FindBy(css = "[type = 'checkbox'][value='1']")
	WebElement agreeCheckBox;

	@FindBy(css = "[type = 'submit'][value='Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//p[contains(text(),'Thank you')]")
	WebElement giftPurchaseConfirmationText;

	@FindBy(css = "#content h1")
	WebElement giftPageHeader;

	public String getGiftPageHeaderText() {
		return giftPageHeader.getText();

	}

	private void enterRecipientName(String recipientName) {
		recipientNameInputBox.sendKeys(recipientName);
	}

	private void enterRecipientEmail(String recipientEmail) {
		recipientEmailInputBox.sendKeys(recipientEmail);
	}

	private void enterSenderName(String senderName) {
		senderNameInputBox.sendKeys(senderName);
	}

	private void enterSenderEmail(String senderEmail) {
		senderEmailInputBox.sendKeys(senderEmail);
	}

	private void clickVoucherThemeBtn() {
		voucherThemeRadioBtn.click();
	}

	private void enterMessageForRecipient(String messageForRecipient) {
		msgInputBox.sendKeys(messageForRecipient);
	}

	private void enterAmount(String amount) {
		amountInputBox.clear();
		amountInputBox.sendKeys(amount);
	}

	private void clickAgreeCheckBox() {
		agreeCheckBox.click();
	}

	private void clickSubmitBtn() {
		continueBtn.submit();
	}

	public void submitGiftPurchaseDetails(String recipientName, String recipientEmail, String senderName,
			String senderEmail, String messageForRecipient, String amount) {
		enterRecipientName(recipientName);
		enterRecipientEmail(recipientEmail);
		enterSenderName(senderName);
		enterSenderEmail(senderEmail);
		clickVoucherThemeBtn();
		enterMessageForRecipient(messageForRecipient);
		enterAmount(amount);
		clickAgreeCheckBox();
		clickSubmitBtn();
	}

	public String getGiftPurchaseConfirmationText() {
		return giftPurchaseConfirmationText.getText();
	}

}