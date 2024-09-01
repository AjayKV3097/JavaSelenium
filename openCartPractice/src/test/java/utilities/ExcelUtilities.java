package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	String path;

	public ExcelUtilities(String path) {
		this.path = path;
	}

	public int getRowCount(String sheetNam) throws IOException {
		fi = new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetNam);
		int rowCount = sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowCount;

	}

	public int getCellCount(String sheetNam, int rowNumber) throws IOException {
		fi = new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetNam);
		int cellCount = sheet.getRow(rowNumber).getLastCellNum();
		workbook.close();
		fi.close();
		return cellCount;

	}

	public String getCellData(String sheetName, int rowNumber, int columnNumber) throws IOException {
		fi = new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rowNumber);
		cell=sheet.getRow(rowNumber).getCell(columnNumber);
		String data = cell.toString();
		return data;
		

	}
	public String setCellData(String sheetName, int rowNumber, int columnNumber, String data) throws IOException {
		File xlfile = new File(path);
		if (xlfile.exists()) {
			workbook = new XSSFWorkbook();
			fo = new FileOutputStream(path);
			workbook.write(fo);
		}

		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		if (workbook.getSheetIndex(sheetName) == 1)
			workbook.createSheet(sheetName);
		sheet = workbook.getSheet(sheetName);
		if (sheet.getRow(rowNumber) == null)
			sheet.createRow(rowNumber);
		row = sheet.getRow(rowNumber);

		cell = row.createCell(columnNumber);
		cell.setCellValue(data);
		fo = new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();

		return data;

	}

	public void fillRedColor(String sheetName, int rowNumber, int columnNumber) throws IOException {
		fi = new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(columnNumber);

		style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}


}
