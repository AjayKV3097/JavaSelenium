package org.selenium.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersAndKeyboard {
	WebDriver driver;

	private void sliders() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement leftSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		WebElement rightSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println(leftSlider.getLocation());// (59,250)
		Actions a = new Actions(driver);
		a.dragAndDropBy(leftSlider, 159, 250).perform();
		System.out.println(rightSlider.getLocation());// (412,250)
		Actions a1 = new Actions(driver);
		a1.dragAndDropBy(rightSlider, -100, 250).perform();
		driver.close();

	}

	private void keyBoards() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList(windowHandles);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ajay");
		driver.switchTo().window(li.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Str");
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidersAndKeyboard s = new SlidersAndKeyboard();
		s.keyBoards();

	}

}
