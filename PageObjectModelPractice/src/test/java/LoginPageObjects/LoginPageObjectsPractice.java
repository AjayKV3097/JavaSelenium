package LoginPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectsPractice {

		WebDriver driver;
	
	//constructor	
		public LoginPageObjectsPractice(WebDriver driver){
		this.driver=driver;
		
	}
		//Elements
		By username =By.id("email");
		By password =By.id("pass");
		By loginButton =By.name("login");
		//Action Methods
	
		public void setUserName(String user) {
			driver.findElement(username).sendKeys(user);
		}
		public void setPassword(String pass) {
			driver.findElement(password).sendKeys(pass);
		}
		public void loginButton() {
			driver.findElement(loginButton).click();;
		}
	
	
	}
