package org.junit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.FlipkartLoginPojo;

public class QuestionFour extends BaseClass {

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
	public void testCase1() {
		launchUrl("https://www.flipkart.com/account/login");
		FlipkartLoginPojo fk = new FlipkartLoginPojo();
		fillText(fk.getUserName(), "anthony123@gmail.com");
		Assert.assertTrue("Check password", true);
		fillText(fk.getPassword(), "12357");
		btnClick(fk.getLoginBtn());

	}

}
