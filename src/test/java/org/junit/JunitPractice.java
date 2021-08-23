
package org.junit;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitPractice extends BaseClass {
	
	@Test
	 public void tc11() {
	 System.out.println("11");
	 }
	
	 @Test
	 public void tc13() {
	 Assert.assertTrue("check testcases", true);
	 System.out.println("13");
	 }
	
	 @Test
	 public void tc10() {
	 System.out.println("10");



//	public static void launchBrowser() {
//		loadBrowser();
//		maxWindow();
//		
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
//		System.out.println("Start Time - "+d);
//	}
//	
//	@After
//	public void endTime() {
//		Date d = new Date();
//		System.out.println("End Time - "+d);
//	}
//	
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
//		WebElement txtEmail = driver.findElement(By.id("email"));
//		fillText(txtEmail, "Amma");
//		
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

}
