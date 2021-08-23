package org.testng;

import org.base.BaseClass;
import org.pom.fbLoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseClass {

	
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
	
//	@Parameters({"emailTxt", "passTxt"})
	@Test(dataProvider = "testData")
	private void fbLoginTest(String s1, String s2) throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		fbLoginPojo fb = new fbLoginPojo();
		fillText(fb.getEmailTxt(), s1);
		fillText(fb.getPassTxt(), s2);
		btnClick(fb.getLoginBtn());
		Thread.sleep(2000);
	}
	
	@DataProvider(name="testData")
	private Object dataTest() {
		return new Object[][] {
			{"anthony", "1354866454vxcv"},
			{"gayathri", "564asda54"},
			{"Jerome", "544dd54"},
			{"California", "11545"}
		};
	}
	
}
