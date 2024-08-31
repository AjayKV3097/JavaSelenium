package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy (xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String emailUser) throws InterruptedException {
		// TODO Auto-generated method stub
		//Thread.sleep(1000);
		txtEmailAddress.sendKeys(emailUser);

	}

	public void setPassword(String passwordUser) throws InterruptedException {
		// TODO Auto-generated method stub
		//Thread.sleep(1000);
		txtPassword.sendKeys(passwordUser);
		

	}
	public void clickLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		//Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,btnLogin);
		

	}

}
