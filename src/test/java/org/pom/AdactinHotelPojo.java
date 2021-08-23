package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelPojo extends BaseClass {

	public AdactinHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(id="username"),
		@FindBy(name="username")
	})
	private WebElement userName;
	
	@FindAll({
		@FindBy(id="password"),
		@FindBy(name="password")
	})
	private WebElement password;
	
	@FindAll({
		@FindBy(id="login"),
		@FindBy(name="login")
	})
	private WebElement loginBtn;
	
	@FindAll({
		@FindBy(id="location"),
		@FindBy(name="location")
	})
	private WebElement location;
	
	@FindAll({
		@FindBy(id="hotels"),
		@FindBy(name="hotels")
	})
	private WebElement hotels;
	
	@FindAll({
		@FindBy(id="room_type"),
		@FindBy(name="room_type")
	})
	private WebElement roomType;
	
	@FindAll({
		@FindBy(id="room_nos"),
		@FindBy(name="room_nos")
	})
	private WebElement numOfRooms;
	
	@FindAll({
		@FindBy(id="datepick_in"),
		@FindBy(name="datepick_in")
	})
	private WebElement checkIn;
	
	@FindAll({
		@FindBy(id="datepick_out"),
		@FindBy(name="datepick_out")
	})
	private WebElement checkOut;
	
	@FindAll({
		@FindBy(id="adult_room"),
		@FindBy(name="adult_room")
	})
	private WebElement adultRoom;
	
	@FindAll({
		@FindBy(id="child_room"),
		@FindBy(name="child_room")
	})
	private WebElement childRoom;
	
	@FindAll({
		@FindBy(id="Submit"),
		@FindBy(name="Submit")
	})
	private WebElement searchButton;
	
	@FindAll({
		@FindBy(id="radiobutton_0"),
		@FindBy(name="radiobutton_0")
	})
	private WebElement radioBtn;
	
	@FindAll({
		@FindBy(id="continue"),
		@FindBy(name="continue")
	})
	private WebElement continueBtn;
	
	@FindAll({
		@FindBy(id="first_name"),
		@FindBy(name="first_name")
	})
	private WebElement firstName;
	
	@FindAll({
		@FindBy(id="last_name"),
		@FindBy(name="last_name")
	})
	private WebElement lastName;
	
	@FindAll({
		@FindBy(id="address"),
		@FindBy(name="address")
	})
	private WebElement addressText;
	
	
	@FindAll({
		@FindBy(id="cc_num"),
		@FindBy(name="cc_num")
	})
	private WebElement ccNumber;
	
	@FindAll({
		@FindBy(id="cc_type"),
		@FindBy(name="cc_type")
	})
	private WebElement cardType;
	
	@FindAll({
		@FindBy(id="cc_exp_month"),
		@FindBy(name="cc_exp_month")
	})
	private WebElement selMonth;
	
	@FindAll({
		@FindBy(id="cc_exp_year"),
		@FindBy(name="cc_exp_year")
	})
	private WebElement selYear;
	
	@FindAll({
		@FindBy(id="cc_cvv"),
		@FindBy(name="cc_cvv")
	})
	private WebElement cvvNum;
	
	@FindAll({
		@FindBy(id="book_now"),
		@FindBy(name="book_now")
	})
	private WebElement bookNowBtn;
	
	@FindAll({
		@FindBy(xpath="//input[@id='order_no']"),
		@FindBy(name="order_no")
	})
	private WebElement orderNum;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
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

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddressText() {
		return addressText;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getSelMonth() {
		return selMonth;
	}

	public WebElement getSelYear() {
		return selYear;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getOrderNum() {
		return orderNum;
	}
	
}
