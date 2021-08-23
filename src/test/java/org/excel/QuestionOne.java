package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuestionOne {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\testExcel.xlsx");
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("stddetails");
		
		int phyRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows in a sheet - " +phyRows);
		
		Row r1 = sheet.getRow(0);
		
		int phyColumn = r1.getPhysicalNumberOfCells();
		System.out.println("Total no of columns in a sheet - " +phyColumn);
	}
}
