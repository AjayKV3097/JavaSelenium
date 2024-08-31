package org.selenium.practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPractice {
	WebDriver driver;
	private void navigatingPractice() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		String s = "https://testautomationpractice.blogspot.com/";
		driver.navigate().to(s);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> numberOfLinks = driver.findElements(By.xpath("//a[contains(@href,'https://en.wikipedia.org/w')]"));
		int size = numberOfLinks.size();
		System.out.println(size);
		for (WebElement webElement : numberOfLinks) {
			webElement.click();
			
		}
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		
		for (String string : li) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			if(title.equals("Selenium disulfide - Wikipedia")|| title.equals("Selenium in biology - Wikipedia")) {
				driver.close();
			}
			
		}
		driver.quit();
	}
	private void navigatingPractice2() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List <String> li = new ArrayList<String>(windowHandles);
		String parentWindow = li.get(0);
		String childWindow = li.get(1);
		String parentTitle = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle);
		String childTitle = driver.switchTo().window(childWindow).getTitle();
		System.out.println(childTitle);
		String parentTitle2 = driver.switchTo().window(parentWindow).getTitle();
		System.out.println(parentTitle2);
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationPractice n = new NavigationPractice();
		n.navigatingPractice();

	}

}
