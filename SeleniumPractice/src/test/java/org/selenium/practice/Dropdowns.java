package org.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdowns {
	WebDriver driver;

	private void normalDropdown() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		Select s = new Select(country);
		s.selectByIndex(1);
		s.selectByValue("usa");
		s.selectByVisibleText("France");
		List<WebElement> options = s.getOptions();
		for (WebElement values : options) {
			System.out.println(values.getText());
		}
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdowns d = new Dropdowns();
		d.normalDropdown();

	}

}
