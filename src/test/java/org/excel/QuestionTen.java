package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class QuestionTen extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		loadBrowser();
		maxWindow();
		launchUrl("http://www.adactin.com/HotelApp/");
		pageTitle();
		pageUrl();
		
		WebElement txtUser = driver.findElement(By.id("username"));
		fillText(txtUser, getHotelData(1, 0));
		
		WebElement txtPass = driver.findElement(By.id("password"));
		fillText(txtPass, getHotelData(1, 1));
		
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		List<WebElement> selOpt = s.getOptions();
//		if (selOpt==) {
//			
//		}
//		for (int i = 0; i < selOpt.size(); i++) {
//			WebElement eachOpt = selOpt.get(i);
//			
//			String txt = eachOpt.getText();
//					System.out.println(txt);
//		}
		
		
		
		
	
		
		
	}
}
