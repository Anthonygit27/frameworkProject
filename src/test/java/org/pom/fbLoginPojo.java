package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbLoginPojo extends BaseClass {
	
	public fbLoginPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="email"),
		@FindBy(name="email")
	})
	private WebElement emailTxt;
	
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="pass")
	})
	private WebElement passTxt;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginBtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getPassTxt() {
		return passTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}
