package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExcelDemo extends BaseClass {

	public static void main(String[] args) throws IOException {
		loadBrowser();
		maxWindow();
		launchUrl("http://www.adactin.com/HotelApp/");
		
		WebElement txtUser = driver.findElement(By.id("username"));
		fillText(txtUser, getHotelData(1, 0));
		
		WebElement txtPass = driver.findElement(By.id("password"));
		fillText(txtPass, getHotelData(1, 1));
		
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
		
		 WebElement loc = driver.findElement(By.id("location"));
		Select s =new Select(loc);
		List<WebElement> selOpt = s.getOptions();
		String s1 = "";
		for (int i = 0; i < selOpt.size(); i++) {
			WebElement eachOpt = selOpt.get(i);
			
			String txtLoc = eachOpt.getText();
				System.out.println(txtLoc);	
		}

		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\bookhotel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sht = w.getSheet("hotel-booking");

		

		for (int i = 0; i < sht.getPhysicalNumberOfRows(); i++) {
			Row rw = sht.createRow(i);
			
			for (int j = 0; j < rw.getPhysicalNumberOfCells(); j++) {
				Cell cl = rw.createCell(j);
				cl.setCellValue(s1);
				
				FileOutputStream fos = new FileOutputStream(f);
				w.write(fos);
				
			}
		}
		
		System.out.println("Success");

	}

}
