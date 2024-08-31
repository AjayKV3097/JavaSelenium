package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesConcept {
	WebDriver driver;
	
	private void framesValidation() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//frame[@src='frame_1.html']")));
		//WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement frame1Element = driver.findElement(By.name("mytext1"));
		frame1Element.sendKeys("Hello");
		
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		WebElement frame2Element = driver.findElement(By.name("mytext2"));
		frame2Element.sendKeys("HelloWorld");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		WebElement frame3Element = driver.findElement(By.name("mytext3"));
		frame3Element.sendKeys("HelloWorld");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		WebElement frame4Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mytext4")));
		frame4Element.sendKeys("Uthaya VAO");
		Thread.sleep(1000);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FramesConcept f  = new FramesConcept();
		f.framesValidation();

	}

}
