package com.naveenautomation.pagechaining.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.naveenautomation.pagechaining.testbase.TestBase;

public class AffiliateLoginPage extends TestBase {

	public AffiliateLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-email")
	WebElement loginInput;

	@FindBy(id = "input-password")
	WebElement pwdInput;

	@FindBy(css = "#content div>div form>input")
	WebElement loginBtn;

	@FindBy(css = "div.list-group>a:nth-of-type(2)")
	WebElement registerationLink;

	@FindBy(css = "div.well>a")
	WebElement registerationBtn;

	@FindBy(css = "form>div.form-group:nth-of-type(2)>a") // could have also used "div.list-group>a:nth-of-type(3)" for
															// the link given in right-side menu
	WebElement forgottenPwdLink;

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

	public AffiliateRegisterationPage clickRegisterationBtn() {
		registerationBtn.click();
		return new AffiliateRegisterationPage();
	}

}