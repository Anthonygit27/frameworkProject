package org.junit;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitAssertSuite extends BaseClass {

	 @Test
	 public void tc121() {
	 System.out.println("121");
	 }
	
	 
	 @Test
	 public void tc113() {
	 Assert.assertTrue("check testcases", false);
	 System.out.println("113");
	 }
	
	 @Ignore
	 @Test
	 public void tc142() {
	 System.out.println("142");
	 }

//	@BeforeClass
//	public static void launchBrowser() {
//		loadBrowser();
//		maxWindow();
//
//	}
//
//	@AfterClass
//	public static void closeBrowser() {
//		quitBrowser();
//	}
//
//	@Before
//	public void startTime() {
//		Date d = new Date();
//		System.out.println("Start Time - " + d);
//	}
//
//	@After
//	public void endTime() {
//		Date d = new Date();
//		System.out.println("End Time - " + d);
//	}
//
//	@Test
//	public void testCase1() throws InterruptedException {
//		launchUrl("https://en-gb.facebook.com/");
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillText(txtEmail, "francis");
//
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fillText(txtPass, "123456");
//
//		WebElement btn = driver.findElement(By.name("login"));
//		btnClick(btn);
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void testCase3() throws InterruptedException {
//		launchUrl("https://en-gb.facebook.com/");
//		String currentUrl = driver.getCurrentUrl();
//		Assert.assertTrue("verify", currentUrl.startsWith("https"));
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillText(txtEmail, "Amma");
//		String atr = txtEmail.getAttribute("value");
//		Assert.assertEquals("Please Verify this test case", "Amma", atr);
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fillText(txtPass, "AMMA123456");
//
//		WebElement btn = driver.findElement(By.name("login"));
//		btnClick(btn);
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void testCase2() throws InterruptedException {
//		launchUrl("https://en-gb.facebook.com/");
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillText(txtEmail, "gayathri");
//
//		WebElement txtPass = driver.findElement(By.id("pass"));
//		fillText(txtPass, "GAYA123456");
//
//		WebElement btn = driver.findElement(By.name("login"));
//		btnClick(btn);
//		Thread.sleep(2000);
//	}
}
