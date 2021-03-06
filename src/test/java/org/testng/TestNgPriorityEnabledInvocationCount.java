package org.testng;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgPriorityEnabledInvocationCount {

	@BeforeClass
	private void openBrowser() {
		System.out.println("Open Browser");
	}
	
	@AfterClass
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println("Start Time - "+ d);
	}
	
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println("End Time - "+ d);
	}
	
	@Test(priority=30)
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test(priority=-20)
	private void tc4() {
		System.out.println("Test Case 4");
	}
	
	@Test(enabled=false)
	private void tc2() {
		System.out.println("Test Case 2");
	}
	
	@Test(enabled=true, invocationCount=3)
	private void tc3() {
		System.out.println("Test Case 3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
