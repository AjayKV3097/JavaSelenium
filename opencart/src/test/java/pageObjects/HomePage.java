package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	
	@FindBy (xpath="//a[normalize-space()='Register']")
	WebElement register;
	
	@FindBy (xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	public void clickMyAccount() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,myAccount);
		//myAccount.click();

	}

	public void clickRegister() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,register);
		//register.click();

	}
	public void clickLogin() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,login);
		

	}
}
