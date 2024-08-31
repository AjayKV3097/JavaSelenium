package org.selenium.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapDropDown {
	WebDriver driver;

	private void bootstrapDropDown() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")));
		dropdown.click();
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.equals("Angular") || text.equals("HTML") || text.equals("CSS")) {
				webElement.click();
			}
		}
		Thread.sleep(1000);
		driver.quit();

	}

	private void hiddenDropdowns() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[6]/div[1]/div[2]/div[1]/div[1]"))
				.click();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		int size = findElements.size();
		System.out.println(size);
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		driver.quit();
	}

	private void hiddenDropdowns2() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		WebElement searchBar = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));
		searchBar.click();
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contains("Indian cricketer")) {
				webElement.click();
				Thread.sleep(1000);
				break;
			}
		}

		driver.quit();
	}

	private void hiddenDropdowns3() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		WebElement until = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search']")));

		until.click();
		until.sendKeys("water");
		List<WebElement> findElements = driver.findElements(By.xpath("//input[@name='search']"));
		int size = findElements.size();
		System.out.println(size);
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			System.out.println(text);
			if (text.contains("water")) {
				webElement.click();
			}
		}
		Thread.sleep(1000);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BootstrapDropDown b = new BootstrapDropDown();
		b.hiddenDropdowns3();

	}

}
