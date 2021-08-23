package org.junit;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionTwo extends BaseClass {

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
		printDateAndTime("Start Time");
	}

	@After
	public void endTime() {
		printDateAndTime("End Time");
	}

	@Test
	public void testCase1() throws InterruptedException {
		launchUrl("https://www.redbus.in/");
		WebElement signIn = driver.findElement(By.xpath("//div[@id='signin-block']"));
		btnClick(signIn);
		
		WebElement signInLink = driver.findElement(By.xpath("//div[@id='signInLink']"));
		btnClick(signInLink);
		
//		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
//		fillText(txtEmail, "8124561464");
//		Assert.assertTrue("Verify Email WebElement", true);

//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fillText(txtPass, "123456");
//		String atr = txtPass.getAttribute("value");
//		Assert.assertEquals("Verify Password Webelement", "123456", atr);
//
//		WebElement btn = driver.findElement(By.name("login"));
//		btnClick(btn);
		

	}
	
}
