package org.data;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// FB
//		loadBrowser();
//		maxWindow();
//		launchUrl("https://en-gb.facebook.com/");
//		pageTitle();
//		pageUrl();
//		WebElement txtMail = driver.findElement(By.id("email"));
//		fillText(txtMail, "antony123@gmai.com");
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fillText(txtPass, "12345678");
//		WebElement loginBtn = driver.findElement(By.name("login"));
//		btnClick(loginBtn);
//		closeBrowser();

		// Greens
		// loadBrowser();
		// maxWindow();
		// launchUrl("http://greenstech.in/selenium-course-content.html");
		// WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
		// mouseHover(course);
		// Thread.sleep(3000);
		// WebElement pgDown = driver.findElement(By.xpath("//a[text()='RPA']"));
		// pageDown(pgDown);
		// Thread.sleep(3000);
		// WebElement pgUP = driver.findElement(By.xpath("//div[@title='Courses']"));
		// pageUp(pgUP);
		// pageScreenshot();
		// closeBrowser();

		// Demo Guru
		loadBrowser();
		maxWindow();
		launchUrl("http://demo.guru99.com/test/drag_drop.html");
		// Debit
		WebElement bank = driver.findElement(By.id("credit2"));
		WebElement bankDrop = driver.findElement(By.xpath("//ol[@id='bank']"));
		dragAndDrop(bank, bankDrop);

		WebElement amt = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement amtDrop = driver.findElement(By.xpath("//ol[@id='amt7']"));
		dragAndDrop(amt, amtDrop);

		// Sales
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement salesDrop = driver.findElement(By.xpath("//ol[@id='loan']"));
		dragAndDrop(sales, salesDrop);

		WebElement amnt = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement amntDrop = driver.findElement(By.xpath("//ol[@id='amt8']"));
		dragAndDrop(amnt, amntDrop);
		closeBrowser();

		// Canara
		// loadBrowser();
		// maxWindow();
		// launchUrl("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		// WebElement btnSignin = driver.findElement(By.xpath("(//input[@class='btn
		// btn-default'])[1]"));
		// btnClick(btnSignin);
		// alertAccept();
		// closeBrowser();

		// alerts
		// loadBrowser();
		// maxWindow();
		// launchUrl("http://demo.automationtesting.in/Alerts.html");
		// WebElement confirmClick =
		// driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		// btnClick(confirmClick);
		// WebElement confirmBtn =
		// driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		// btnClick(confirmBtn);
		// alertDismiss();
		// WebElement promptClick =
		// driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		// btnClick(promptClick);
		// WebElement promptBtn =
		// driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		// btnClick(promptBtn);
		// Thread.sleep(3000);
		// alertPrompt("This is the Prompt Alert by Anthony");
		// alertAccept();
		// Thread.sleep(7000);
		// closeBrowser();

		// alerts
		// loadBrowser();
		// maxWindow();
		// launchUrl("https://www.flipkart.com/");
		// driver.findElement(By.xpath("//button[text()='✕']")).click();
		// driver.findElement(By.xpath("//input[@title='Search for products, brands and
		// more']")).sendKeys("redmi phone");
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//div[text()='REDMI 9i (Nature Green, 64
		// GB)']")).click();
		// allWindowID();
		// newWindow(1);
		// WebElement pincode = driver.findElement(By.id("pincodeInputId"));
		// fillText(pincode, "600071");
		// quitBrowser();

		// FB
		loadBrowser();
		maxWindow();
		launchUrl("https://en-gb.facebook.com/");
		WebElement fbMail = driver.findElement(By.id("email"));
		jsSetText("anthony123@gmail.com", fbMail);
		// fillText(fbMail, "faceboo4242424@gmail.com");
		robSelect(fbMail);
		Thread.sleep(3000);
		robCopy(fbMail);
		robTab(fbMail);
//		WebElement fbPass = driver.findElement(By.id("pass"));
		// fillText(fbPass, "12345");
		robPaste(fbMail);
		Thread.sleep(5000);
		printTxt(fbMail);
		WebElement forgetPass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		rightclick(forgetPass);
		robDown(3);
		Thread.sleep(3000);
		pageScreenshot("fb-login");
		robEnter();

	}

}
