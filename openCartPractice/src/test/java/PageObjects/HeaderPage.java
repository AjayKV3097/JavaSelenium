package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{

	public HeaderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Page objects
	@FindBy (xpath="//span[normalize-space()='My Account']")
	WebElement myAccount;
	@FindBy (xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement register;		
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement login;
	
	//Actions
	
	public void clickMyAccount() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,myAccount);

	}
	public void clickRegister() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,register);

	}
	public void clickLogin() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", login);

	}

}
