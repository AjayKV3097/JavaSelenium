package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActions {
	WebDriver driver;
	private void mouseHover() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement desktops = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Desktops']")));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(desktops).moveToElement(mac).perform();
		Thread.sleep(1000);
		driver.quit();
	}
	private void rightClick() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		////span[normalize-space()='Copy']
		WebElement copy = driver.findElement(By.xpath("//span[normalize-space(text())='Copy']"));
		Actions a  = new Actions(driver);
		a.contextClick(rightClick).perform();
		copy.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		driver.quit();
	
	}
	
	private void doubleClick() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		WebElement field1 = driver.findElement(By.id("field1"));
		WebElement field2 = driver.findElement(By.id("field2"));
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		field1.clear();
		field1.sendKeys("Hello Ajay");
		Actions a = new Actions(driver);
		a.doubleClick(button).perform();
		String field2Value = field2.getAttribute("value");
		System.out.println(field2Value);
		if(field2Value.equals("Hello Ajay")) {
			System.out.println("Copied");
		}
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MouseActions a  = new MouseActions();
		a.doubleClick();

	}

}
