package org.excel;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionSeven extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		loadBrowser();
		maxWindow();
		launchUrl("https://en-gb.facebook.com/");

		WebElement txtUser = driver.findElement(By.id("email"));
		fillText(txtUser, getFBData(1, 0));

		WebElement txtPass = driver.findElement(By.id("pass"));
		fillText(txtPass, getFBData(1, 1));
		
		WebElement login = driver.findElement(By.name("login"));
		btnClick(login);
		
		WebElement errorTxt = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		printDataInExcel(errorTxt, 1, 2);
		
		
		
		
	}
	
}
