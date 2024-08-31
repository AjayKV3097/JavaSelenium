package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement setEmail;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement setPassword;
	@FindBy (xpath="//input[@value='Login']")
	WebElement clickLogin;

	public void setEmail(String email) {
		setEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		setPassword.sendKeys(password);
	}

	public void clickLogin() {
		clickLogin.click();
	}

	
}
