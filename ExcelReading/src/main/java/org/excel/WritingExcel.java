package org.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream("C:\\Users\\AJAY\\OneDrive\\Desktop\\Vijay.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet createSheet = book.createSheet("Sheet1");
		XSSFRow row0 = createSheet.createRow(0);
		row0.createCell(0).setCellValue("Name");
		row0.createCell(1).setCellValue("English");
		row0.createCell(2).setCellValue("Tamil");
		row0.createCell(3).setCellValue("Maths");
		XSSFRow row1 = createSheet.createRow(1);
		row1.createCell(0).setCellValue("Ajay");
		row1.createCell(1).setCellValue("98.0");
		row1.createCell(2).setCellValue("99.0");
		row1.createCell(3).setCellValue("100.0");
		
		XSSFRow row3 = createSheet.createRow(3);
		row3.createCell(3).setCellValue("Ajay");
		book.write(file);
		System.out.println("File created");
		book.close();
		
	}

}
