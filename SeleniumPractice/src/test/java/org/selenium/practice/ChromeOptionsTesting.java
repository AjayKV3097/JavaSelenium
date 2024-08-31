package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeOptionsTesting {
	WebDriver driver;

	public void headlessPractice() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");

		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.close();
	}

	public void insecureWebsite() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.close();
	}
	public void inCognito() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptionsTesting c = new ChromeOptionsTesting();
		c.inCognito();

	}

}
