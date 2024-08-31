package ord.testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentReportManager.class)
public class ListenersPractice {

	WebDriver driver;

	@BeforeTest
	private void setup() {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}
	
	@Test(priority = 1)
	private void login() {
		// TODO Auto-generated method stub

		driver.findElement(By.id("email")).sendKeys("9787657458");
		driver.findElement(By.id("pass")).sendKeys("Ajasou@1430");
		driver.findElement(By.name("login")).click();
	}
	@Test(priority=2)
	private void assertFailingCheck() {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		boolean empty = title.isEmpty();
		Assert.assertEquals(empty, true);
	}

	@AfterTest
	private void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();
	}
}
