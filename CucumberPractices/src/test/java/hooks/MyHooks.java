package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MyHooks extends DriverInit{
	
	@Before
	public void beforeLogin(Scenario scenario) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	    Thread.sleep(2000);
	    byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "image/png");

	}
	@After
	public void afterScenario(Scenario scenario) {
		// TODO Auto-generated method stub
		boolean failed = scenario.isFailed();
		System.out.println(failed);
		if(failed=true) {
			byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
		driver.close();
	}
	

}
