package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionTwo extends BaseClass {

	public QuestionTwo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({
		@FindBy(xpath="//input[@id='username']"),
		@FindBy(xpath="//input[@name='username']")
	})
	private WebElement txtUser;
	
	@FindAll({
		@FindBy(xpath="//input[@id='password']"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindAll({
		@FindBy(xpath="//select[@id='location']"),
		@FindBy(xpath="//select[@name='location']")
	})
	private WebElement location;
	
	@FindAll({
		@FindBy(xpath="//select[@id='hotels']"),
		@FindBy(xpath="//select[@name='hotels']")
	})
	private WebElement hotels;
	
	@FindAll({
		@FindBy(xpath="//select[@id='room_type']"),
		@FindBy(xpath="//select[@name='room_type']")
	})
	private WebElement roomType;
	
	@FindAll({
		@FindBy(xpath="//select[@id='room_nos']"),
		@FindBy(xpath="//select[@name='room_nos']")
	})
	private WebElement roomNos;
	
	@FindAll({
		@FindBy(xpath="//input[@id='datepick_in']"),
		@FindBy(xpath="//input[@name='datepick_in']")
	})
	private WebElement datePickIn;
	
	@FindAll({
		@FindBy(xpath="//input[@id='datepick_out']"),
		@FindBy(xpath="//input[@name='datepick_out']")
	})
	private WebElement datePickOut;
	
	@FindAll({
		@FindBy(xpath="//select[@id='adult_room']"),
		@FindBy(xpath="//select[@name='adult_room']")
	})
	private WebElement adultRoom;
	
	@FindAll({
		@FindBy(xpath="//select[@id='child_room']"),
		@FindBy(xpath="//select[@name='child_room']")
	})
	private WebElement childRoom;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	
	
	
	
}
