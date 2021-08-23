package org.junit;

import java.util.Date;

import org.base.BaseClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionOne extends BaseClass {

	@BeforeClass
	public static void launchBrowser() {
		loadBrowser();
		maxWindow();

	}

	@AfterClass
	public static void closeBrowser() {
		quitBrowser();
	}

	@Before
	public void startTime() {
		printDateAndTime("Start Time - ");
	}

	@After
	public void endTime() {
		printDateAndTime("End Time - ");
	}

	@Test
	public void testCase1() throws InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		fillText(txtEmail, "francis");
		Assert.assertTrue("Verify Email WebElement", true);

		WebElement txtPass = driver.findElement(By.id("pass"));
		fillText(txtPass, "123456");
		String atr = txtPass.getAttribute("value");
		Assert.assertEquals("Verify Password Webelement", "123456", atr);

		WebElement btn = driver.findElement(By.name("login"));
		btnClick(btn);
		

	}
}
