package LoginPageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageObjects {
	WebDriver driver;
	//constructor
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//locators
	@FindBy(xpath = "//input[@placeholder='Username']") 
	WebElement userName;
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") 
	WebElement login;
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement dashBoard;
	//methods
	public void setUserName(String username) {
		userName.sendKeys(username);
	}
	public void setpassword(String password) {
		passWord.sendKeys(password);
	}
	public void login() {
		// TODO Auto-generated method stub
		login.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	public void verifyDashboard() {
		// TODO Auto-generated method stub
		String text = dashBoard.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Dashboard");
	}
}
