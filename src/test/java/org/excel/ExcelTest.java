package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelTest {

	public static void main(String[] args) throws IOException {
		
		File fil = new File("C:\\Course\\Selenium\\MavenTest\\excel\\testExcel.xlsx");
		
		FileInputStream finput = new FileInputStream(fil);
		
		Workbook w = new XSSFWorkbook(finput);
		
		Sheet sheet = w.getSheet("stddetails");
		
		Row ro = sheet.getRow(9);
//		
		Cell cell = ro.getCell(1);
		System.out.println(cell);
		
		int phyRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total no of rows "+phyRows);
//		
//		Row ro = sheet.getRow(7);
//		
		int phyCells = ro.getPhysicalNumberOfCells();
		System.out.println("Total no of cells "+phyCells);
//		
		Cell ce = ro.getCell(0);
		System.out.println(ce);
		
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row ro = sheet.getRow(i);
//			
//			for (int j = 0; j <ro.getPhysicalNumberOfCells(); j++) {
//				Cell ce = ro.getCell(j);
//				System.out.println(ce+ "\n");
//			}
//		}
		
		
	}
}
