package LoginPageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginPageObjects.LoginPageObjects;
import LoginPageObjects.LoginPageObjectsPractice;

public class LoginTestPractice2 {
	WebDriver driver;
	
	
	@BeforeTest
	private void launchBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);

	}
	
	@Test
	private void loginApplication() {
		// TODO Auto-generated method stub
		LoginPageObjectsPractice l = new LoginPageObjectsPractice(driver);
		l.setUserName("97876567458");
		l.setPassword("Ajasou@1430");
		l.loginButton();
		Assert.assertEquals(driver.getTitle(), "Facebook");
		

	}
	
	@AfterTest
	private void closeBrowser() {
		// TODO Auto-generated method stub
	
		driver.close();
	}
}

