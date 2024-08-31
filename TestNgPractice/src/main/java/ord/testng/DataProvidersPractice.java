package ord.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersPractice {
	WebDriver driver;

	@BeforeTest
	private void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	@Test(dataProvider = "credentials")
	private void login(String username,String password) {
		// TODO Auto-generated method stub

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
	}

	@AfterTest
	private void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	@DataProvider(name="credentials",indices = {0,2})
	private String[][] loginData() {
		// TODO Auto-generated method stub
		String data[][]= {{"9787657458","Ajasou@1430"},{"email2","password2"},{"email3","password3"}};
		
		return data;
	}
	
}
