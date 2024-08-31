package LoginPageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LoginPageObjects.LoginPageObjects;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeTest
	private void launchBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);

	}
	
	@Test
	private void loginApplication() {
		// TODO Auto-generated method stub
		LoginPageObjects l = new LoginPageObjects(driver);
		l.setUserName("Admin");
		l.setpassword("admin123");
		l.login();
		l.verifyDashboard();

	}
	
	@AfterTest
	private void closeBrowser() {
		// TODO Auto-generated method stub
	
		driver.close();
	}
}

