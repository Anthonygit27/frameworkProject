package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupTest  {
	
	@BeforeClass
	private void startBrowser() {
		System.out.println("Start Browser");
	}
	
	@AfterClass
	private void endBrowser() {
		System.out.println("End Browser");
	}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start Time");
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End Time");
	}
	
	@Test(groups="Sony")
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test(groups="Mi")
	private void tc2() {
		System.out.println("Test Case 2");
	}

	
	@Test(groups= {"Sony,Mi"})
	private void tc3() {
		System.out.println("Test Case 3");
	}

	
	@Test(groups="Realme")
	private void tc4() {
		System.out.println("Test Case 4");
	}


	@Test(groups="Mi")
	private void tc5() {
		System.out.println("Test Case 5");
	}

}
