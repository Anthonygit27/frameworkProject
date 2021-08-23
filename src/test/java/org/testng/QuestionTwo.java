package org.testng;

import org.base.BaseClass;
import org.pom.fbLoginPojo;
import org.pom.redBusPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QuestionTwo extends BaseClass {

	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	
	@AfterClass
	private void endBrowser() {
//		quitBrowser();
	}
	
	@BeforeMethod
	private void StartTime() {
		printDateAndTime("Start Time - ");
	}
	
	@AfterMethod
	private void endTime() {
		printDateAndTime("End Time - ");
	}
	
	@Parameters({"rbMobNum"})
	@Test
	private void rbLoginTest(String num) throws InterruptedException {
		launchUrl("https://www.redbus.in/");
		redBusPojo rb = new redBusPojo();
		btnClick(rb.getIconProfileClick());
		btnClick(rb.getSignInClick());
		iFrameTxt("modalIframe");
		btnClick(rb.getMobNumber());
		fillText(rb.getMobNumber(), num);
		Thread.sleep(3000);
		
		btnClick(rb.getOtpcheck());
		btnClick(rb.getOtpBtn());
		
	}
	
}
