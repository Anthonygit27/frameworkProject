package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuestionTwo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\testExcel.xlsx");
		FileInputStream fInpt = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fInpt);
		Sheet sheet = w.getSheet("stddetails");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row rw = sheet.getRow(i);
			
			for (int j = 0; j < rw.getPhysicalNumberOfCells(); j++) {
				Cell cl = rw.getCell(j);
				System.out.println(cl);
			}
		}
	}
}
