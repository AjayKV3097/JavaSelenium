package org.selenium.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.lu.a;

public class BrokenLinkPractice {
	WebDriver driver;
	
	private void findBrokenLink() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		int count=0;
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		for (WebElement webElement : atag) {
			String attribute = webElement.getAttribute("href");
			if(attribute.equals(null)||attribute.isEmpty()) {
				System.out.println("Nota valid Link");
				continue;
			}
			
			try {
				URL u = new URL(attribute);
				HttpURLConnection openConnection = (HttpURLConnection)u.openConnection();
				openConnection.connect();
				
				if(openConnection.getResponseCode()>=400) {
					System.out.println("Broken Link->: "+openConnection);
					count++;
			}
				else {
					System.out.println("Non Broken Link->: "+openConnection);
				}
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			}
		System.out.println(count);
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokenLinkPractice b = new BrokenLinkPractice();
		b.findBrokenLink();

	}

}
