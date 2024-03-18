package com.naveenautomation.pagechaining.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;
import com.sun.org.apache.bcel.internal.generic.Select;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this); // this method is defined inside the constructor to initialize all the
												// elements of the current class object.
	}

	@FindBy(name = "#search>input")
	WebElement searchInput;

	@FindBy(css = "#cart>button")
	WebElement cartSummaryBtn;

	@FindBy(css = "#cart>ul")
	WebElement cartSummaryDropDown;
	
	@FindBy(css = "#menu>div:nth-of-type(2)>ul")
	WebElement topMenu;

	@FindBy(css = "#menu .dropdown:first-of-type>a")
	WebElement desktopsLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(2)>a")
	WebElement laptopsNNotebooksLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(3)>a")
	WebElement componentsLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(4)>a")
	WebElement tabletsLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(5)>a")
	WebElement softwareLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(6)>a")
	WebElement phoneNPdasLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(7)>a")
	WebElement camerasLink;

	@FindBy(css = "#menu>div:nth-of-type(2)>ul>li:nth-of-type(8)>a")
	WebElement mp3PlayersLink;

	@FindBy(css = "//nav[@id='menu']//li[@class='dropdown']//a[contains(text(), 'PC ')]")
	// items other than show all in dropdowns can also be found through css:
	// #menu>div>ul>li:nth-of-type(i) li:nth-of-type(j)>a, where i is the index (not
	// in terms of array) of category and j is index of product under the dropdown
	// in that category

	WebElement pcInDesktopDropDown;

	@FindBy(css = "//nav[@id='menu']//li[@class='dropdown']//a[contains(text(), 'Mac ')]")
	WebElement macInDesktopDropDown;

	@FindBy(css = "#menu>div>ul>li:first-of-type>div>a")
	WebElement showAllInDesktopDropDown;

	@FindBy(css = "#menu>div>ul>li:nth-of-type(2)>div>a")
	WebElement showAllInLptpAndNtbkDropDown;

	@FindBy(css = "#menu>div>ul>li:nth-of-type(3)>div>a")
	WebElement showAllInComponentsDropDown;

	@FindBy(css = "#menu>div>ul>li:nth-of-type(8)>div>a")
	WebElement showAllInMp3DropDown;

	@FindBy(css = "#content>div.row .button-group")
	List<WebElement> addToCartBtn4Featured;

	@FindBy(css = "#common-home>div>i")
	WebElement addToCartSuccessMsg;

	@FindBy(css = "div.row>div:first-of-type>ul>li:first-of-type>a") // could have used x-path
																		// //footer//a[contains(text(), 'About Us')] as
																		// well
	WebElement aboutUsLink;

	@FindBy(xpath = "div.row>div:first-of-type>ul>li:nth-of-type(2)>a")
	WebElement deliveryInformationLink;

	@FindBy(xpath = "div.row>div:first-of-type>ul>li:nth-of-type(3)>a")
	WebElement privacyPolicyLink;

	@FindBy(xpath = "div.row>div:first-of-type>ul>li:nth-of-type(4)>a")
	WebElement termsNConfLink;

	@FindBy(css = "div.row>div:nth-of-type(2)>ul.list-unstyled>li:first-of-type>a")
	WebElement contactUsLink;

	@FindBy(css = "div.row>div:nth-of-type(2)>ul.list-unstyled>li:nth-of-type(2)>a")
	WebElement returnsLink;

	@FindBy(css = "div.row>div:nth-of-type(2)>ul.list-unstyled>li:nth-of-type(3)>a")
	WebElement siteMapLink;

	@FindBy(css = "div.row>div:nth-of-type(3)>ul.list-unstyled>li:first-of-type>a")
	WebElement brandsLink;

	@FindBy(css = "div.row>div:nth-of-type(3)>ul.list-unstyled>li:nth-of-type(2)>a")
	WebElement giftCertificateLink;

	@FindBy(css = "div.row>div:nth-of-type(3)>ul.list-unstyled>li:nth-of-type(3)>a")
	WebElement affiliateLink;

	@FindBy(css = "div.row>div:nth-of-type(3)>ul.list-unstyled>li:nth-of-type(4)>a")
	WebElement specialsLink;

	@FindBy(css = "div.row>div:nth-of-type(4)>ul.list-unstyled>li:first-of-type>a")
	WebElement myAcctLink;
	
	

	@FindBy(css = "div.row>div:nth-of-type(4)>ul.list-unstyled>li:nth-of-type(2)>a")
	WebElement orderHistoryLink;

	@FindBy(css = "div.row>div:nth-of-type(4)>ul.list-unstyled>li:nth-of-type(3)>a")
	WebElement wishListLink;

	@FindBy(css = "div.row>div:nth-of-type(4)>ul.list-unstyled>li:nth-of-type(4)>a")
	WebElement newsLetterLink;

	public AboutUsPage clickAboutUsLink() {
		aboutUsLink.click();
		return new AboutUsPage();
	}

	public DeliveryInformationPage clickDeliveryInformationLink() {
		deliveryInformationLink.click();
		return new DeliveryInformationPage();
	}

	public PrivacyPolicyPage clickPrivacyPolicyLink() {
		privacyPolicyLink.click();
		return new PrivacyPolicyPage();
	}

	public TermsNCondPage clickTermsNCondLink() {
		termsNConfLink.click();
		return new TermsNCondPage();
	}

	public ContactUsPage ClickContactUsLink() {
		contactUsLink.click();
		return new ContactUsPage();
	}

	public ReturnPage clickReturnsLink() {
		returnsLink.click();
		return new ReturnPage();
	}

	public SiteMapPage clickSiteMapLink() {
		siteMapLink.click();
		return new SiteMapPage();
	}

	public BrandsPage clickBrandsLink() {
		brandsLink.click();
		return new BrandsPage();
	}

	public GiftCertificatesPage clickGiftCertificatesLink() {
		giftCertificateLink.click();
		return new GiftCertificatesPage();
	}

	public AffiliateLoginPage clickAffiliateLink() {
		affiliateLink.click();
		return new AffiliateLoginPage();
	}

	public SpecialOfferPage clickSpecialsLink() {
		specialsLink.click();
		return new SpecialOfferPage();
	}

	public AccountLoginPage clickMyAccountLink() {
		myAcctLink.click();
		return new AccountLoginPage();
	}

	public AccountLoginPage clickOrderHistoryLink() {
		orderHistoryLink.click();
		return new AccountLoginPage();
	}

	public AccountLoginPage clickWishListLink() {
		wishListLink.click();
		return new AccountLoginPage();
	}

	public AccountLoginPage clickNewsLetterLink() {
		newsLetterLink.click();
		return new AccountLoginPage();
	}
}