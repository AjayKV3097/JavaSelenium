package org.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelUsingScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream("C:\\Users\\AJAY\\OneDrive\\Desktop\\Kijay.xlsx");
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet createSheet = book.createSheet("Sheet1");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row count");
		int rowcount = s.nextInt();
		System.out.println("Enter cell count");
		int cellcount = s.nextInt();
		
		for (int i = 0; i <= rowcount; i++) {
			XSSFRow createRow = createSheet.createRow(i);
			for (int j = 0; j < cellcount; j++) {
				XSSFCell createdCell = createRow.createCell(j);
				System.out.println("Enter cell value of : "+ j);
				createdCell.setCellValue(s.next());
				
			}
			
		}
		book.write(file);
		System.out.println("File created");
		book.close();
		
	}

}
