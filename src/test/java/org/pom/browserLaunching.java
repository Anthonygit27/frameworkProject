package org.pom;

import java.awt.AWTException;
import java.io.IOException;

import org.base.BaseClass;

public class browserLaunching extends BaseClass {
	
public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	//Q1
//	loadBrowser();
//	maxWindow();
//	launchUrl("https://en-gb.facebook.com/");
//	pageTitle();
//	pageUrl();
//	
//	QuestionOnePojo qop = new QuestionOnePojo();
//	
//	fillText(qop.getTxtUser(), getExcelData(3, 2));
//	fillText(qop.getTxtPass(), getExcelData(3, 3));
//	btnClick(qop.getBtnLogin());
	
	//Q5
//	loadBrowser();
//	maxWindow();
//	launchUrl("http://adactinhotelapp.com/");
//	pageTitle();
//	pageUrl();
//	
//	QuestionTwo qt = new QuestionTwo();
//	
//	fillText(qt.getTxtUser(), getHotelData(1, 0));
//	fillText(qt.getTxtPass(), getHotelData(1, 1));
//	btnClick(qt.getBtnLogin());
//	dropdownSelect(qt.getLocation(), 1);
//	hotelBookingData(qt.getLocation(), 2, 0);
//	dropdownSelect(qt.getHotels(), 2);
//	hotelBookingData(qt.getHotels(), 2, 1);
//	System.out.println("success");
	
	
	//Q2
	
//	loadBrowser();
//	maxWindow();
//	launchUrl("http://www.greenstechnologys.com/");
//	QuestionThree qThree = new QuestionThree();
//	pageDown(qThree.getPgDown());
//	printTxt(qThree.getPgDown());
//	
//	pageUp(qThree.getPgUp());
//	printTxt(qThree.getPgUp());
//	
//	btnClick(qThree.getCertClick());
//	
//	btnClick(qThree.getSelCourseContent());
//	
//	mouseHover(qThree.getMouseCourse());
//	
//	Thread.sleep(3000);
//	mouseHover(qThree.getMouseJava());
//	
//	Thread.sleep(3000);
//	mouseHover(qThree.getCoreJavaClick());
//	btnClick(qThree.getCoreJavaClick());
//	
//	pageDown(qThree.getScrollToJava());
//	printTxt(qThree.getScrollToJava());
//	
//	pageUp(qThree.getCareerClick());
//	btnClick(qThree.getCareerClick());
//	
//	pageDown(qThree.getCareerPgdown());
//	printTxt(qThree.getCareerPgdown());
//	
//	pageUp(qThree.getContactBtn());
//	btnClick(qThree.getContactBtn());
//	
//	newWindow(1);
//	
//	printTxt(qThree.getMainBranch());
//	
//	printTxt(qThree.getCopyrightText());
//	
//	System.out.println("success");
	
	
	//QuestionFive
	loadBrowser();
	maxWindow();
	launchUrl("http://adactinhotelapp.com/");
	QuestionFive qf = new QuestionFive();
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
	jsGetText(qf.getOrderNum());
	System.out.println("Success");
	
	
	
}
	
}
