package org.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxHandling {
	WebDriver driver;
	private void checkboxTest() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		String s = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(s);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//checkBoxes.get(0).click();
		for (int i = 0; i < checkBoxes.size(); i++) {
			checkBoxes.get(i).click();
			
		}
		for (int i = 0; i < 3; i++) {
			checkBoxes.get(i).click();
			
		}
//		for (WebElement webElement : checkBoxes) {
//			webElement.click();
//			
//		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkboxHandling c = new checkboxHandling();
		c.checkboxTest();

	}

}
