package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	WebDriver driver;
	private void alertsValidation() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement findElement = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		findElement.click();
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		WebElement findElement2 = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		findElement2.click();
		Alert a2 = driver.switchTo().alert();
		String text2 = a.getText();
		System.out.println(text2);
		a.dismiss();
		WebElement findElement3 = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		findElement3.click();
		Alert a3 = driver.switchTo().alert();
		String text3 = a.getText();
		a.sendKeys("HelloWorld");
		System.out.println(text2);
		a.accept();
		WebElement findElement4 = driver.findElement(By.xpath("//p[@id='result']"));
		String text4 = findElement4.getText();
		System.out.println(text4);
		driver.close();
	}
	private void alertsValidation2() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		String text = until.getText();
		System.out.println(text);
		Thread.sleep(1000);
		until.accept();
	}
	private void alertValidation3() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth/");
		

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alerts s = new Alerts();
		s.alertValidation3();

	}

}
