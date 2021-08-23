package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redBusPojo extends BaseClass {

	public redBusPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="i-icon-profile")
	private WebElement iconProfileClick;
	
	@FindBy(id="signInLink")
	private WebElement signInClick;
	
	
	@FindBy(xpath="(//input[@id='mobileNoInp'])[2]")
	private WebElement mobNumber;
	
	
	@FindBy(xpath="(//div[@class='recaptcha-checkbox-border'])[6]")
	private WebElement otpcheck;

	@FindBy(xpath="(//div[@id='otp-container'])[3]")
	private WebElement otpBtn;

	public WebElement getIconProfileClick() {
		return iconProfileClick;
	}

	public WebElement getSignInClick() {
		return signInClick;
	}

	public WebElement getMobNumber() {
		return mobNumber;
	}

	public WebElement getOtpcheck() {
		return otpcheck;
	}

	public WebElement getOtpBtn() {
		return otpBtn;
	}
	
	
	
	
}
