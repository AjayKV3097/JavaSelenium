package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
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
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnContinue2;

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		txtFirstName.sendKeys(firstName);

	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		txtLastName.sendKeys(lastName);

	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		txtEmail.sendKeys(email);

	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub
		txtPassword.sendKeys(password);

	}

	public void setConfirmPassword(String confirmPassword) {
		// TODO Auto-generated method stub
		txtConfirmPassword.sendKeys(confirmPassword);

	}

	public void setTelephone(String telephone) {
		// TODO Auto-generated method stub
		txtTelephone.sendKeys(telephone);

	}

	public void clickAgree() {
		// TODO Auto-generated method stub
		chkdPolicy.click();

	}

	public void clickContinue() {
		// TODO Auto-generated method stub
		btnContinue.click();

	}
	public void clickContinue2() {
		// TODO Auto-generated method stub
		btnContinue2.click();

	}
	public void clickLogout() {
		// TODO Auto-generated method stub
		logout.click();

	}

	public String verifyMessage() {
		// TODO Auto-generated method stub
		try {
			String text = msgConfirmation.getText();
			return text;
		} catch (Exception e) {
			return e.getMessage();
		}

	}
}
