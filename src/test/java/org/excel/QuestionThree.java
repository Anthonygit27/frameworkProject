package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuestionThree {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sht = w.getSheet("naukri");
		
		sht.createRow(2);
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		
		System.out.println("Success");
	}
}
