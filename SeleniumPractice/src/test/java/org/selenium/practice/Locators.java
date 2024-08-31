package org.selenium.practice;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	WebDriver driver;
	public Locators(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public  void verifyTitleOfPage() {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		if (title.equals("Adactin.com - Hotel Reservation System")) {

			System.out.println("Matched");
		}
		}
	
	public void clickLogin(String username,String password) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'usernam')]")));
		username1.sendKeys(username);
		driver.findElement(By.xpath("//input[starts-with(@id,'passwo')]")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		
		
	}
	public void searchHotel(String hotelName) {
		// TODO Auto-generated method stub
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);		
		s.selectByValue("Sydney");
		driver.findElement(By.xpath("(//input[contains(text(),Search)])[4]")).click();
	}

	

}