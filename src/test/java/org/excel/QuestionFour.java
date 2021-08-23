package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionFour extends BaseClass {

	public static void main(String[] args) throws IOException {

		loadBrowser();
		maxWindow();
		launchUrl("http://www.adactin.com/HotelApp/");
		pageTitle();
		pageUrl();

		WebElement txtUser = driver.findElement(By.id("username"));
		fillText(txtUser, "francis2727");

		WebElement txtPass = driver.findElement(By.id("password"));
		fillText(txtPass, "FQDH45");

		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);

		// 1
		WebElement loc = driver.findElement(By.xpath("//td[text()='Location']"));
		String txt = loc.getText();
//		hotelBookingData(0, 0, txt);

		// 2
//		WebElement hotl = driver.findElement(By.xpath("//td[text()='Hotels&nbsp;']"));
//		String hotlTxt = hotl.getText();
//		hotelBookingData(0, 1, hotlTxt);

		// 3
//		WebElement room = driver.findElement(By.xpath("//td[text()='Room Type&nbsp;']"));
//		String roomTxt = room.getText();
//		hotelBookingData(0, 2, roomTxt);

		// 4
		WebElement noOfRooms = driver.findElement(By.xpath("//td[text()='Number of Rooms']"));
		String nRoomsTxt = noOfRooms.getText();
//		hotelBookingData(0, 3, nRoomsTxt);

		// 5
		WebElement checkIn = driver.findElement(By.xpath("//td[text()='Check In Date']"));
		String txtcheckIn = checkIn.getText();
//		hotelBookingData(0, 4, txtcheckIn);

		// 6
		WebElement checkOut = driver.findElement(By.xpath("//td[text()='Check Out Date']"));
		String txtCheckOut = checkOut.getText();
//		hotelBookingData(0, 5, txtCheckOut);

		// 7
		WebElement adults = driver.findElement(By.xpath("//td[text()='Adults per Room']"));
		String txtAdult = adults.getText();
//		hotelBookingData(0, 6, txtAdult);

		// 8
//		WebElement child = driver.findElement(By.xpath("//td[text()='Children per Room&nbsp;']"));
//		String txtChild = child.getText();
//		hotelBookingData(0, 7, txtChild);

		WebElement location = driver.findElement(By.id("location"));
//		dropdownData(location);

		System.out.println("Success");

	}
}
