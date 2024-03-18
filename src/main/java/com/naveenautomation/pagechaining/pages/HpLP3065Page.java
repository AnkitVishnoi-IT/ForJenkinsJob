package com.naveenautomation.pagechaining.pages;

import java.time.LocalDate;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class HpLP3065Page extends TestBase {
	
	public void HPLP3065Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "input-option225")
	WebElement inputDate;
		
	@FindBy(id = "input-quantity")
	WebElement inputQuantity;
	
	@FindBy(id = "button-cart")
	WebElement addToCartBtn;
	
	@FindBy(css = "#product-product>div:first-of-type")
	WebElement addToCartSuccessText;
	
	@FindBy(css = ".rating>p>a:last-of-type")
	WebElement reviewBtn;
	
	@FindBy(id = "input-name")
	WebElement inputReview;
	
	@FindBy(id = "input-rating")
	WebElement inputName;
	
	@FindBy(css = "input[value='5']")
	WebElement rating;
	
	@FindBy(css = ".pull-right>button")
	WebElement continueBtn;
	
	@FindBy(css = ".form-horizontal>div:nth-of-type(2)")
	WebElement reviewSubmitText;
	
	
	
	public String clickOnaddToCartButton() {
		inputDate.sendKeys(LocalDate.now().toString());
		inputQuantity.sendKeys("1");
		addToCartBtn.click();
		return addToCartSuccessText.getText();
	}
	

	public void submitReviewUnsuccessfully() {
		reviewBtn.click();
		inputName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		inputReview.sendKeys(RandomStringUtils.randomAlphabetic(15));
		rating.click();
		continueBtn.click();
	}
	
	public void submitReviewSuccessfully() {
		reviewBtn.click();
		inputName.sendKeys(RandomStringUtils.randomAlphabetic(6));
		inputReview.sendKeys(RandomStringUtils.randomAlphabetic(30));
		rating.click();
		continueBtn.click();
	}
	
	public String getReviewSubmitText() {
		return reviewSubmitText.getText();
	}
	
	

}
