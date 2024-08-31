package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	WebDriver driver;
	
	private void enteringUsingJs() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		String s = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','Ajay')", name);
		j.executeScript("arguments[0].click()", radio);
		boolean selected = radio.isSelected();
		System.out.println(selected);
		Thread.sleep(1000);
		driver.quit();
		

	}
	private void scrollingPages() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://greenstech.in/");
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		WebElement programming = driver.findElement(By.xpath("//span[normalize-space()='Programming & Frameworks']"));
		js.executeScript("arguments[0].scrollIntoView()", programming);

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scrolling s  = new Scrolling();
		s.scrollingPages();

	}

}
