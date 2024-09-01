package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productsPage extends BasePage {

	public productsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//a[normalize-space()='Tablets']")
	WebElement tablets;
	@FindBy(xpath = "//a[starts-with(text(),'Samsung')]")
	WebElement samsungTablet;
	@FindBy (id = "button-cart")
	WebElement addToCart;
	@FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement verifyMessage;
	@FindBy (xpath = "//span[@id='cart-total']")
	WebElement cart;
	@FindBy (xpath = "//strong[normalize-space()='Checkout']")
	WebElement checkout;
	@FindBy (xpath = "(//table[@class='table table-bordered']//td[6])[2]")
	WebElement verifyAmount;
	@FindBy (xpath = "//a[normalize-space()='Logout']")
	WebElement logout;
	@FindBy (xpath = "//h1[normalize-space()='Account Logout']")
	WebElement logoutMessage;
	
	@FindBy (xpath = "//a[@class='btn btn-primary']")
	WebElement continueBtn;
	
	
	
	
	public void clickTablet() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", tablets);
	}
	public void clickSamsungTablet() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", samsungTablet);
	}
	public void clickAddToCart() throws InterruptedException {
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", addToCart);
		Thread.sleep(1000);
		addToCart.click();
	}
	public String verifyMessage() {
		String text = verifyMessage.getText();
		return text;
	}
	public String verifyAmount() {
		String amount = verifyAmount.getText();
		return amount;
	}
	public String verifyLogoutMessage() {
		String message = logoutMessage.getText();
		return message;
	}
	public void clickCart() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", cart);
	}
	public void clickCheckout() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", checkout);
	}
	public void clickLogout() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", logout);
	}
	public void clickContinue() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", continueBtn);
	}

}
