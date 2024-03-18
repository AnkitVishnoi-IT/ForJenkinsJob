package com.naveenautomation.pagechaining.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".list-inline>li:nth-of-type(2)")
	private WebElement myAcctDropDownBtn;

	@FindBy(css = ".list-inline>li:nth-of-type(2)>ul>li:last-of-type")
	private WebElement myAccountLogOutBtn;

	@FindBy(name = "#search>input")
	private WebElement searchInput;

	@FindBy(css = "#cart>button")
	private WebElement cartSummaryBtn;

	@FindBy(css = "#cart>ul")
	private WebElement cartSummaryDropDown;

	@FindBy(css = ".list-group>a")
	private List<WebElement> sideNavMenuList;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul")
	private WebElement topMenu;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li>a")
	private List<WebElement> topMenuList;

	@FindBy(css = "#menu>div>ul>li>div>a")
	private List<WebElement> showAllInCategoryLink;
	
	@FindBy(css = "#menu .dropdown:first-of-type>a")
	WebElement desktopsLink;
	
	@FindBy(css = "#menu>div>ul>li:first-of-type>div>a")
	WebElement showAllInDesktopDropDown;

//			@FindBy(css = "#menu .dropdown:first-of-type>a")
//			private WebElement desktopsLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(2)>a")
//			private WebElement laptopsNNotebooksLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(3)>a")
//			private WebElement componentsLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(4)>a")
//			private WebElement tabletsLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(5)>a")
//			private WebElement softwareLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(6)>a")
//			private WebElement phoneNPdasLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(7)>a")
//			private WebElement camerasLink;
//
//			@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(8)>a")
//			private WebElement mp3PlayersLink;
//
//			@FindBy(xpath = "//nav[@id='menu']//li[@class='dropdown']//a[contains(text(), 'PC ')]")
//			private WebElement pcInDesktopDropDown;
//
//			@FindBy(xpath = "//nav[@id='menu']//li[@class='dropdown']//a[contains(text(), 'Mac ')]")
//			private WebElement macInDesktopDropDown;
//
//			@FindBy(css = "#menu>div>ul>li:first-of-type>div>a")
//			private WebElement showAllInDesktopDropDown;
//			
//			@FindBy(css = "#menu>div>ul>li:nth-of-type(2)>div>a")
//			private WebElement showAllInLptpAndNtbkDropDown;
//
//			@FindBy(css = "#menu>div>ul>li:nth-of-type(3)>div>a")
//			private WebElement showAllInComponentsDropDown;
//
//			@FindBy(css = "#menu>div>ul>li:nth-of-type(8)>div>a")
//			private WebElement showAllInMp3DropDown;

	@FindBy(css = "#content>h2:first-of-type")
	private WebElement myAccountBannerTxt;

	@FindBy(css = "#content>ul:nth-of-type(1) li:nth-of-type(2) a")
	private WebElement changePwdBtn;

	@FindBy(css = "#content>ul:last-of-type>li")
	WebElement newsLetterLink;

	@FindBy(css = "#content>h1")
	WebElement accountCreationConfirmationText;

	@FindBy(css = "#account-account>div")
	private WebElement successBanner;

	public void getMyAccountDropDownMenu() {
		myAcctDropDownBtn.click();
	}

	public String getMyAccountText() {
		return myAccountBannerTxt.getText();
	}

	public String getSuccessBannerText() {
		return successBanner.getText();
	}

	public AccountLogoutPage clickLogOutBtn() {
		getMyAccountDropDownMenu();
		myAccountLogOutBtn.click();
		return new AccountLogoutPage();
	}

	public ChangePwdPage clickChangePasswordBtn() {
		changePwdBtn.click();
		return new ChangePwdPage();
	}

	public AddressBookPage clickAddressBookInSideNavMenu(String item) {
		for (int i = 0; i < sideNavMenuList.size(); i++) {
			if (sideNavMenuList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavMenuList.get(i).click();
				break;
			}
		}
		return new AddressBookPage();
	}

	public RewardPointsPage clickRewardPointsInSideNavMenu(String item) {
		for (int i = 0; i < sideNavMenuList.size(); i++) {
			if (sideNavMenuList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavMenuList.get(i).click();
				break;
			}
		}
		return new RewardPointsPage();
	}

	public TransactionsPage clickTransactionsInSideNavMenu(String item) {
		for (int i = 0; i < sideNavMenuList.size(); i++) {
			if (sideNavMenuList.get(i).getText().equalsIgnoreCase(item)) {
				sideNavMenuList.get(i).click();
				break;
			}
		}
		return new TransactionsPage();
	}

	public String getAccountCreationConfirmationText() {
		return accountCreationConfirmationText.getText();
	}

	public NewsLetterPage clickOnNewsLetterLink() {
		newsLetterLink.click();
		return new NewsLetterPage();
	}

	public DesktopPage clickShowAllDesktop(String category) {
		desktopsLink.click();
		showAllInDesktopDropDown.click();
		return new DesktopPage();
	}

}
