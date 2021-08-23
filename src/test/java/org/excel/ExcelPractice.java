package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Course\\Selenium\\MavenTest\\excel\\datadriventest.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sht = w.getSheet("userdetails");
		
//		Row rw = sht.getRow(2);
//		
//		Cell cl = rw.getCell(3);
//		System.out.println(cl);
		
		
		
		for (int i = 0; i < sht.getPhysicalNumberOfRows(); i++) {
			Row rw = sht.getRow(i);
			
			for (int j = 0; j < rw.getPhysicalNumberOfCells(); j++) {
				Cell cl = rw.getCell(j);
//				System.out.println(cl);
				
				int cellType = cl.getCellType();
				
				if (cellType==1) {
					
					String scl = cl.getStringCellValue();
					System.out.println(scl);
				}else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cl)) {
						Date dcl = cl.getDateCellValue();
						SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
						String format = sdf.format(dcl);
						System.out.println(format);
					}else {
						double ncl = cl.getNumericCellValue();
						long l = (long)ncl;
						
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}
				
			}
		}
	}
}
