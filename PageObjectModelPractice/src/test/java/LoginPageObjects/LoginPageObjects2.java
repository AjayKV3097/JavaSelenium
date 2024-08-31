package LoginPageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageObjects2 {
	WebDriver driver;
	//constructor
	public LoginPageObjects2(WebDriver driver) {
		this.driver=driver;
		
	}
	//locators
	By userName =By.xpath("//input[@placeholder='Username']");
	By passWord =By.xpath("//input[@placeholder='Password']");
	By login =By.xpath("//button[@type='submit']");
	By dashBoard =By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	
	
	//methods
	public void setUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}
	public void setpassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
	public void login() {
		// TODO Auto-generated method stub
		driver.findElement(login).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	public void verifyDashboard() {
		// TODO Auto-generated method stub
		String text = driver.findElement(dashBoard).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Dashboard");
	}
}
