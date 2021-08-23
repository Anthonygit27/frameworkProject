package org.junit;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.AdactinHotelPojo;

public class QuestionSeven extends BaseClass{

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
	public void testCase1() throws InterruptedException, IOException {
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		AdactinHotelPojo qf = new AdactinHotelPojo();
		fillText(qf.getUserName(), getHotelData(1, 0));
		fillText(qf.getPassword(), getHotelData(1, 1));
		btnClick(qf.getLoginBtn());
		fillText(qf.getLocation(), getHotelData(1, 2));
		fillText(qf.getHotels(), getHotelData(1, 3));
		fillText(qf.getRoomType(), getHotelData(1, 4));
		fillText(qf.getNumOfRooms(), getHotelData(1, 5));
		clearText(qf.getCheckIn());
		fillText(qf.getCheckIn(), getHotelData(1, 6));
		clearText(qf.getCheckOut());
		fillText(qf.getCheckOut(), getHotelData(1, 7));
		fillText(qf.getAdultRoom(), getHotelData(1, 8));
		fillText(qf.getChildRoom(), getHotelData(1, 9));
		btnClick(qf.getSearchButton());
		btnClick(qf.getRadioBtn());
		btnClick(qf.getContinueBtn());
		fillText(qf.getFirstName(), getHotelData(1, 10));
		fillText(qf.getLastName(),getHotelData(1, 11));
		fillText(qf.getAddressText(), getHotelData(1, 12));
		fillText(qf.getCcNumber(), getHotelData(1, 13));
		fillText(qf.getCardType(), getHotelData(1, 14));
		fillText(qf.getSelMonth(), getHotelData(1, 15));
		fillText(qf.getSelYear(), getHotelData(1, 16));
		fillText(qf.getCvvNum(), getHotelData(1, 17));
		btnClick(qf.getBookNowBtn());
		Thread.sleep(10000);
		WebElement table = driver.findElement(By.className("login"));
		List<WebElement> tabRow = table.findElements(By.tagName("tr"));
		WebElement tR = tabRow.get(17);
		List<WebElement> tabData = tR.findElements(By.tagName("td"));
		WebElement tD = tabData.get(1);
		jsGetText(tD);
		pageTitle();
		System.out.println("Success");
	}
}
