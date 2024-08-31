package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	WebDriver driver;
	
	private void fileUpload() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Ajay.txt"+"\n"+"D:\\Vijay.txt");
		int size = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(size==2) {
			System.out.println("2 file uploaded success");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload f = new FileUpload();
		f.fileUpload();
	}

}
