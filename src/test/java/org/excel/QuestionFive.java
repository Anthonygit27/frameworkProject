package org.excel;

import java.io.IOException;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionFive extends BaseClass {

	public static void main(String[] args) throws IOException {

		loadBrowser();
		maxWindow();
		launchUrl("http://www.adactin.com/HotelApp/");

		WebElement txtUser = driver.findElement(By.id("username"));
		fillText(txtUser, getHotelData(1, 0));

		WebElement txtPass = driver.findElement(By.id("password"));
		fillText(txtPass, getHotelData(1, 1));

		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);

		WebElement locSel = driver.findElement(By.id("location"));
		fillText(locSel, getHotelData(1, 2));

		WebElement hotSel = driver.findElement(By.id("hotels"));
		fillText(hotSel, getHotelData(1, 3));

		WebElement roomSel = driver.findElement(By.id("room_type"));
		fillText(roomSel, getHotelData(1, 4));

		WebElement roomNum = driver.findElement(By.id("room_nos"));
		fillText(roomNum, getHotelData(1, 5));

		WebElement checkIn = driver.findElement(By.id("datepick_in"));
		clearText(checkIn);
		fillText(checkIn, getHotelData(1, 6));
		

		WebElement checkOut = driver.findElement(By.id("datepick_out"));
		clearText(checkOut);
		fillText(checkOut, getHotelData(1, 7));

		WebElement adultSel = driver.findElement(By.id("adult_room"));
		fillText(adultSel, getHotelData(1, 8));

		WebElement childSel = driver.findElement(By.id("child_room"));
		fillText(childSel, getHotelData(1, 9));
		
//		quitBrowser();
		
		System.out.println("Success");
	}
}
