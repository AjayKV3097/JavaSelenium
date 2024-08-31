package org.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	WebDriver driver;

	public void WebTable() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		int rowsize = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int columnsize = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		int price = 0;
		System.out.println(rowsize);
		// print all datas
		for (int r = 2; r <= rowsize; r++) {
			for (int c = 1; c <= columnsize; c++) {
				String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]"))
						.getText();
				System.out.print(text + "\t");

			}
			System.out.println();

		}
		for (int r = 2; r <= rowsize; r++) {
			String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			price = price + Integer.parseInt(text);

		}
		System.out.println(price);

		driver.quit();
	}

	private void tableCheckBox() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/table");
		int rowsize = driver.findElements(By.xpath("//table[@id='simpletable']//tr")).size();
		int columnsize = driver.findElements(By.xpath("//table[@id='simpletable']//th")).size();
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='simpletable']//tr"));
		for (int r = 1; r <= rowsize; r++) {
			for (int c = 1; c <columnsize; c++) {
				
				String text = driver.findElement(By.xpath("//table[@id='simpletable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(text);
				
				}
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebTable t = new WebTable();
		t.tableCheckBox();
	}

}
