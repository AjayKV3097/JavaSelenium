import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseworkspace2.0\\Selenium\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9787657458");
		driver.findElement(By.id("pass")).sendKeys("Ajasou@1430");
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(20000);
		
		driver.quit();

	}

}
