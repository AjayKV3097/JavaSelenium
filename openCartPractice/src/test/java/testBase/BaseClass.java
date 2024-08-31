package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.collections4.Get;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.logging.LoggerManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	public Logger log ;
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		// TODO Auto-generated method stub
		driver= new ChromeDriver();
		WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
		prop = new Properties();
		FileReader file = new FileReader("D:\\eclipseworkspace2.0\\openCartPractice\\src\\test\\resources\\config.properties");
		prop.load(file);
		log=LogManager.getLogger(this.getClass());
		driver.get(prop.getProperty("appURL2"));
		driver.manage().window().maximize();

	}
	@AfterClass
	public void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();

	}
	
	public String randomStrings() {
		// TODO Auto-generated method stub
		RandomStringUtils r = new RandomStringUtils();
		String randomAlphabetic = r.randomAlphabetic(10);
		return randomAlphabetic;

	}
	public String randomNumbers() {
		// TODO Auto-generated method stub
		RandomStringUtils r = new RandomStringUtils();
		String randomNumeric = r.randomNumeric(9);
		return randomNumeric;

	}
	public String randomAlphaNumbers() {
		// TODO Auto-generated method stub
		RandomStringUtils r = new RandomStringUtils();
		String randomAlphaNumeric = r.randomAlphanumeric(10);
		return randomAlphaNumeric;

	}

}
