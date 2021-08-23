package org.data;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelData extends BaseClass {

	public static void main(String[] args) throws IOException {
	
		// FB
		loadBrowser();
		maxWindow();
		launchUrl("https://en-gb.facebook.com/");
		pageTitle();
		pageUrl();
		WebElement txtMail = driver.findElement(By.id("email"));
		fillText(txtMail, getExcelData(2, 0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		fillText(txtPass, getExcelData(2, 3));
//		WebElement loginBtn = driver.findElement(By.name("login"));
//		btnClick(loginBtn);
//		closeBrowser();
	}
}
