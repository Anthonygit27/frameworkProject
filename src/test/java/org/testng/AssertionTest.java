package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

	@BeforeClass
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@AfterClass
	private void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start Time");
	}
	
	@AfterMethod
	private void endTime() {
	System.out.println("End Time");
	}
	
	@Test
	private void testCase1() {
		Assert.assertTrue(false, "Test 1 Failed");
		System.out.println("Test case 1");
		System.out.println("Oracle");
		System.out.println("Java");
		System.out.println("Phython");
		
		
	}
	
	@Test
	private void testCase2() {
		System.out.println("Test case 2");
	}
	
	@Test
	private void testCase3() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		System.out.println("Test case 3");
		System.out.println("Oracle");
		s.assertAll();
		System.out.println("Java");
		System.out.println("Phython");
		
	}

	
}
