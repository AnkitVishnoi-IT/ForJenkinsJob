package com.naveenautomation.pagechaining.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.pagechaining.testbase.TestBase;

public class DesktopPage extends TestBase{
	
	public void DesktopsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "div.caption a")
	List<WebElement> productClickBtnsList;
	
	@FindBy(css = "div:nth-of-type(3) .caption a")
	WebElement hpLP3065;
	
	public HpLP3065Page clickOnDesktop() {
		hpLP3065.click();
		return new HpLP3065Page();
	}
}

