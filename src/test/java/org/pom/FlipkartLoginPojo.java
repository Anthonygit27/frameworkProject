package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPojo extends BaseClass {
	
	public FlipkartLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="(//input[@type='text'])[2]"),
		@FindBy(className="//input[@class='_2IX_2- VJZDxU']")
	})
	private WebElement userName;
	
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(className="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	})
	private WebElement password;
	
	@FindAll({
		@FindBy(xpath="(//button[@type='submit'])[2]"),
		@FindBy(className="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	})
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
}
