package ord.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingPractice {
	WebDriver driver;

	@Parameters({"browser"})
	@BeforeTest
	private void setup(String br) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default: System.out.println("Invalid Browser");
			return;
		}
		
		driver.get("https://www.facebook.com/");

	}
	
	@Test
	private void login() {
		// TODO Auto-generated method stub

		driver.findElement(By.id("email")).sendKeys("9787657458");
		driver.findElement(By.id("pass")).sendKeys("Ajasou@1430");
		driver.findElement(By.name("login")).click();
	}

	@AfterTest
	private void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();
	}

}
