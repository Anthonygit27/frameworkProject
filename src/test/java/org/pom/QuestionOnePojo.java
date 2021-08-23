package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class QuestionOnePojo extends BaseClass {

	public QuestionOnePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({ 
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']")
	})
	private WebElement txtUser;

	@FindAll({
		@FindBy(xpath="//input[@id='franciis']"),
		@FindBy(xpath="//input[@name='pass']")
	})
	private WebElement txtPass;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
