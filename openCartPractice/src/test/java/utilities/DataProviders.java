package utilities;

import java.io.IOException;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "LoginData")
	public String[][] dataProvidersTest() throws IOException {
		String path1 = ".\\testData\\opencartApplicatiom.xlsx";
		ExcelUtilities e = new ExcelUtilities(path1);
		int rowCount = e.getRowCount("Sheet1");
		int cellCount = e.getCellCount("Sheet1", 1);
		String loginData[][]= new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				loginData[i-1][j]=e.getCellData("Sheet1", i, j);
				
			}
			
		}
		return loginData;
	}
}
