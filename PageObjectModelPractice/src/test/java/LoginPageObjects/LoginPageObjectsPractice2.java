package LoginPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectsPractice2 {

		WebDriver driver;
	
	//constructor	
		public LoginPageObjectsPractice2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		//Elements
		@FindBy (id="email") WebElement username;
		@FindBy (id="pass") WebElement password;
		@FindBy (name="login") WebElement loginButton;
		//Action Methods
	
		public void setUserName(String user) {
			username.sendKeys(user);
		}
		public void setPassword(String pass) {
			password.sendKeys(pass);
		}
		public void loginButton() {
		loginButton.click();
		}
	
	
	}
