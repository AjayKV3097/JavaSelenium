package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//h2[normalize-space()='My Account']")
	WebElement myAccountLabel;
	
	@FindBy (xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;
	
	public boolean verifyMyAccountPage() {
		// TODO Auto-generated method stub
		try {
		boolean displayed = myAccountLabel.isDisplayed();
		return displayed;
		}
		catch (Exception e) {
			return false;
		}
	}
	public void clickLogout() {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();" ,logout);
		

	}


}
