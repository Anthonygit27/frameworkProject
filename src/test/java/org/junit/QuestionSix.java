package org.junit;

import java.util.List;

import org.base.BaseClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AdactinHotelPojo;
import org.pom.QuestionFive;

public class QuestionSix extends BaseClass {

	@BeforeClass
	public static void launchBrowser() {
		loadBrowser();

	}

	@AfterClass
	public static void closeBrowser() {
		// quitBrowser();
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
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		AdactinHotelPojo qf = new AdactinHotelPojo();
		fillText(qf.getUserName(), "francis2727");
		fillText(qf.getPassword(), "SF088Q");
		btnClick(qf.getLoginBtn());
		dropdownSelect(qf.getLocation(), 2);
		dropdownSelect(qf.getHotels(), 2);
		dropdownSelect(qf.getRoomType(), 3);
		dropdownSelect(qf.getNumOfRooms(), 6);
		clearText(qf.getCheckIn());
		fillText(qf.getCheckIn(), "25/09/2021");
		clearText(qf.getCheckOut());
		fillText(qf.getCheckOut(), "28/09/2021");
		dropdownSelect(qf.getAdultRoom(), 2);
		dropdownSelect(qf.getChildRoom(), 1);
		btnClick(qf.getSearchButton());
		btnClick(qf.getRadioBtn());
		btnClick(qf.getContinueBtn());
		fillText(qf.getFirstName(), "Andrew");
		fillText(qf.getLastName(), "Martin");
		fillText(qf.getAddressText(), "No:23/A, R.M.Nagar, Bihar");
		fillText(qf.getCcNumber(), "1234564156247896");
		dropdownSelByVisibleTxt(qf.getCardType(), "Other");
		dropdownSelByVisibleTxt(qf.getSelMonth(), "October");
		dropdownSelByVisibleTxt(qf.getSelYear(), "2021");
		fillText(qf.getCvvNum(), "123");
		btnClick(qf.getBookNowBtn());
		Thread.sleep(10000);
		WebElement table = driver.findElement(By.className("login"));
		List<WebElement> tabRow = table.findElements(By.tagName("tr"));
		WebElement tR = tabRow.get(17);
		List<WebElement> tabData = tR.findElements(By.tagName("td"));
		WebElement tD = tabData.get(1);
		jsGetText(tD);
		System.out.println("Success");
	}

}
