package org.testng;

import org.base.BaseClass;
import org.pom.FlipkartLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QuestionFour extends BaseClass {

	@BeforeClass
	private void browserLaunch() {
		loadBrowser();
		maxWindow();
	}
	
	@AfterClass
	private void endBrowser() {
		quitBrowser();
	}
	
	@BeforeMethod
	private void startTime() {
		printDateAndTime("Start Time");
	}
	
	@AfterMethod
	private void endTime() {
		printDateAndTime("End Time");
	}
	
	
//	@Parameters({"fpMobNum","fpPassword"})
	@Test(dataProvider="testdata")
	private void testCase1(String s1, String s2) throws InterruptedException {
		launchUrl("https://www.flipkart.com/account/login");
		FlipkartLoginPojo fl = new FlipkartLoginPojo();
		fillText(fl.getUserName(), s1);
		
		fillText(fl.getPassword(), s2);
		btnClick(fl.getLoginBtn());
		Thread.sleep(2000);
	}
	
	@DataProvider(name="testdata")
	private Object printData() {
		return new Object[][] {
			{"gayathri","64564564653"},
			{"Jerome", "746464"},
			{"Chinnadurai", "5646456157"}
			
		};
	}
	
}
