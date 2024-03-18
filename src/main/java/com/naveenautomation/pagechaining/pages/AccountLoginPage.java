package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;




public class AccountLoginPage extends TestBase {

	public AccountLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement loginInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "#content div>div form>input")
	WebElement loginBtn;

	@FindBy(css = "div.list-group>a:nth-of-type(2)")
	WebElement registerationBtn;
	
	@FindBy(css = "form>div.form-group:nth-of-type(2)>a") //could have also used "div.list-group>a:nth-of-type(3)" for the link given in right-side menu
	WebElement forgottenPwdLink;

	@FindBy(css = "div.row>div:nth-of-type(3)>ul.list-unstyled>li:nth-of-type(2)>a")
	WebElement giftCertificateLink;
	
	@FindBy(css = ".container>div.row>div:first-of-type>ul>li:first-of-type>a") //could have used x-path //footer//a[contains (text(), 'About Us')] as well
	WebElement aboutUsLink; 
	
	@FindBy(xpath = "//footer//a[contains(text(), 'Delivery Information')]")
	WebElement deliveryInformationLink;
	
	@FindBy(xpath = "//footer//a[text()='Privacy Policy']")
	WebElement privacyPolicyLink;

	@FindBy(xpath = "//footer//a[text()='Terms & Conditions']")
	WebElement termsNConfLink;
	
	private void enterEmail(String email) {
		loginInput.sendKeys(email);
		
	}

	private void enterPwd(String pwd) {
		pwdInput.sendKeys(pwd);
	}

	private void clickLogin() {
		loginBtn.click();
	}

	public MyAccountPage submitLogin(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new MyAccountPage();
	}

	public ForgotPasswordPage clickForgotPwdLink() {
		forgottenPwdLink.click();
		return new ForgotPasswordPage();
	}

	
	public RegisterAccountPage clickRegisterationBtn() {
		registerationBtn.click();
		return new RegisterAccountPage();
	}
	
	public NewsLetterPage submitLoginForNewsLetterLink(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new NewsLetterPage();
	}
	
	public OrderHistoryPage submitLoginForOrderHistoryLink(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new OrderHistoryPage();
	}
	
	public MyWishListPage submitLoginForWishListLink(String email, String pwd) {
		enterEmail(email);
		enterPwd(pwd);
		clickLogin();
		return new MyWishListPage();
	}
}