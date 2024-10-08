package testBase;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageObjects.BasePage;

public class BaseClass {
	public  WebDriver driver;
	public Logger logger;
	public Properties prop;

	@BeforeTest(groups = {"Sanity","Regression","Master"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException {
		// TODO Auto-generated method stub
		prop = new Properties();
		FileReader file = new FileReader("D:\\eclipseworkspace2.0\\opencart\\src\\test\\resources\\config.properties");
		prop.load(file);
		logger = LogManager.getLogger(this.getClass());
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote")){
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setPlatform(Platform.WIN11);
			capabilities.setBrowserName("chrome");
			
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
		}	
		if(prop.getProperty("execution_env").equalsIgnoreCase("local")) {
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
		}
		driver.get(prop.getProperty("appURL2"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}

	@AfterTest(groups = {"Sanity","Regression","Master"})
	public void tearDown() {
		// TODO Auto-generated method stub
		driver.quit();

	}

	public String randomString() {
		String randomAlphabetic = RandomStringUtils.randomAlphabetic(5);
		return randomAlphabetic;
	}

	public String randomNumbers() {
		String randomNumeric = RandomStringUtils.randomNumeric(10);
		return randomNumeric;
	}

	public String randomAlphaNumeric() {
		// TODO Auto-generated method stub
		String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(14);
		return (randomAlphanumeric + "@");
	}

}
