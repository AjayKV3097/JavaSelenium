package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;
	@FindBy(name = "agree")
	WebElement chkdPolicy;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnContinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);

	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);

	}

	public void setConfirmPassword(String confirmPassword) {
		txtConfirmPassword.sendKeys(confirmPassword);

	}
	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);

	}

	public void setPrivacyPolicy() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();" ,chkdPolicy);
		//chkdPolicy.click();

	}
	public void clickContinue() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();" ,btnContinue);
		//btnContinue.click();

	}
	public String getConfirmationMsg() {
		try {
			String text = msgConfirmation.getText();
			return text;
			
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
		
		
	}

}
