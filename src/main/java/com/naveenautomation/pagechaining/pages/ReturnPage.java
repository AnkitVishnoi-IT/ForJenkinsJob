package com.naveenautomation.pagechaining.pages;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class ReturnPage extends TestBase {

	public ReturnPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#content>h1")
	WebElement returnPageHeader;

	public String getReturnPageText() {
		return returnPageHeader.getText();
	}

	@FindBy(id = "input-firstname")
	WebElement firstName;
	@FindBy(id = "input-lastname")
	WebElement lastName;
	@FindBy(id = "input-email")
	WebElement email;
	@FindBy(id = "input-telephone")
	WebElement phone;
	@FindBy(id = "input-order-id")
	WebElement orderId;
	@FindBy(id = "input-date-ordered")
	WebElement orderDate;
	@FindBy(id = "input-product")
	WebElement productName;
	@FindBy(id = "input-model")
	WebElement productCode;
	@FindBy(id = "input-quantity")
	WebElement quantity;
	@FindBy(css = "input[value='2']")
	WebElement returnReasonRadioBtn;
	@FindBy(css = "input[value='0']")
	WebElement openedProductRadioBtn;
	@FindBy(id = "input-comment")
	WebElement otherdetails;
	@FindBy(css = "input[value='Submit']")
	WebElement submitBtn;
	@FindBy(css = "div[id='content']>p:nth-of-type(2)")
	WebElement returnCnfText;

	public ReturnCnfPage submitReturnDetails() {
		firstName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		lastName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		email.sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
		phone.sendKeys(RandomStringUtils.randomNumeric(10));
		orderId.sendKeys(RandomStringUtils.randomAlphabetic(4));
		orderDate.sendKeys(LocalDate.now().minus(Period.ofDays((new Random().nextInt(365 * 70)))).toString());
		productName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		productCode.sendKeys(RandomStringUtils.randomAlphabetic(4));
		quantity.sendKeys("1");
		returnReasonRadioBtn.click();
		openedProductRadioBtn.click();
		submitBtn.submit();

		return new ReturnCnfPage();
	}

	public String getText() {
		return returnCnfText.getText();
	}

}