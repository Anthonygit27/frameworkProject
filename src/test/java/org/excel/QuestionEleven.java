package org.excel;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuestionEleven extends BaseClass {

	public static void main(String[] args) throws IOException {

		loadBrowser();
		maxWindow();
		launchUrl("https://my.naukri.com/account/createaccount");
		pageTitle();
		pageUrl();

		WebElement fresherBtn = driver.findElement(By.xpath("(//button[@name='userType'])[1]"));
		btnClick(fresherBtn);

		WebElement txtName = driver.findElement(By.xpath("//input[@id='fname']"));
		fillText(txtName, getNaukriData(2, 0));

		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		fillText(txtEmail, getNaukriData(2, 1));

		WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
		fillText(txtPass, getNaukriData(2, 2));

		WebElement phNum = driver.findElement(By.xpath("//input[@name='number']"));
		fillText(phNum, getNaukriData(2, 3));

		WebElement selCity = driver
				.findElement(By.xpath("(//input[@placeholder='Tell us about your current city'])[1]"));
		fillText(selCity, getNaukriData(2, 4));
		WebElement selState = driver.findElement(By.xpath("//input[@name='state']"));
		fillText(selState, getNaukriData(2, 5));

	}
}
