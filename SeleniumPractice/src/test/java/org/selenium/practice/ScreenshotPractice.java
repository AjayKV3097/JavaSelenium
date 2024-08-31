package org.selenium.practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotPractice {
	WebDriver driver;
	
	public void screenshotPract() {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
	driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	TakesScreenshot s = (TakesScreenshot)driver;
	File source = s.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\eclipseworkspace2.0\\SeleniumPractice\\screenshots\\sample.png");
	source.renameTo(des);
	
	//
	WebElement customer = driver.findElement(By.xpath("//h5[normalize-space()='Customer Service']"));
	File screenshotAs = customer.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\eclipseworkspace2.0\\SeleniumPractice\\screenshots\\sample.png");
	screenshotAs.renameTo(dest);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScreenshotPractice s = new ScreenshotPractice();
		s.screenshotPract();

	}

}
