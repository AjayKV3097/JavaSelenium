package org.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream file = new FileInputStream("D:\\eclipseworkspace2.0\\ExcelReading\\target\\config.properties");
		Properties p = new Properties();
		p.load(file);
		String property = p.getProperty("URL");
		Set<Entry<Object, Object>> entrySet = p.entrySet();
		System.out.println(entrySet);
		Set<Object> keySet = p.keySet();
		System.out.println(keySet);
		Collection<Object> values = p.values();
		System.out.println(values);
		System.out.println(property);
		driver.get(property);
		driver.findElement(By.name("email")).sendKeys(p.getProperty("userName"));
		driver.close();

	}

}
