package org.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunnerFile {

	 // driver initialize
	 WebDriver driver ;
	 

	@BeforeTest
	public  void browserLaunch() {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Locators l = new Locators(driver);
		l.verifyTitleOfPage();
		
	}


	@Test(priority = 1)
	private void userLoggingIn() throws InterruptedException  {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		Locators l = new Locators(driver);
		Thread.sleep(1000);
		l.clickLogin("AjayVcetEceb", "Ajasou@1430");
	}
	@Test(priority = 2)
	private void userSearchingHotel() throws InterruptedException  {
		// TODO Auto-generated method stub
		
		Locators l = new Locators(driver);
		Thread.sleep(1000);
		l.searchHotel("Sydney");
		
	}
	
	@AfterTest
	public  void closeBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		driver.quit();

	}
}

