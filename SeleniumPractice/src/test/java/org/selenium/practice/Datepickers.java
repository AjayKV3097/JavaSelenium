package org.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepickers {
	WebDriver driver;
	private void datePickers() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
//		date.sendKeys("08/17/2024");
//		Thread.sleep(1000);
//		
//		//approach 2
//		date.clear();
		
		String year ="2025";
		String month="september";
		String day="29";
		date.click();

		Thread.sleep(1000);
		while(true) {
			String monthCheck = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yearCheck = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			WebElement next = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
			WebElement previous = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
			if(monthCheck.equalsIgnoreCase(month) && yearCheck.equals(year)){
				break;
				
			}

			next.click();
		}	
		List<WebElement> dayCheck = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		
			for (WebElement webElement : dayCheck) {
				if(webElement.getText().equals(day)) {
					webElement.click();
					break;
				}
			}
			
			driver.quit();
		}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Datepickers d  = new Datepickers();
		d.datePickers();

	}

}
