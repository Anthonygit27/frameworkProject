package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.pom.fbLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QuestionOne extends BaseClass  {

	@BeforeClass
	private void launchBrowser() {
		loadBrowser();
		maxWindow();
	}
	
	@AfterClass
	private void endBrowser() {
		quitBrowser();
	}
	
	@BeforeMethod
	private void StartTime() {
		printDateAndTime("Start Time - ");
	}
	
	@AfterMethod
	private void endTime() {
		printDateAndTime("End Time - ");
	}
	
	@Parameters({"emailTxt", "passTxt"})
	@Test
	private void fbLoginTest(String name, String pass) {
		launchUrl("https://www.facebook.com/");
		fbLoginPojo fb = new fbLoginPojo();
		fillText(fb.getEmailTxt(), name);
		fillText(fb.getPassTxt(), pass);
		btnClick(fb.getLoginBtn());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
