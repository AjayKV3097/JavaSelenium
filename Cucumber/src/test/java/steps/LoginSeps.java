package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.DriverInit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.MyHooks;

public class LoginSeps extends DriverInit{

	


	

	@And("when user enters username as {string}")
	public void whenUserEntersUsernameAs(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys(username);
	     

	}

	@And("when user enters password as {string}")
	public void whenUserEntersPasswordAs(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(password);
	     
	}

	@When("user clicks login button")
	public void userClicksLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();

	}

	@Then("login should be successful")
	public void loginShouldBeSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Login success");
  
	}
	@But("login should not be successful")
	public void loginShouldNotBeSuccessful() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//b[contains(text(),'Invalid Login details or Your Password might have ')]")).getText();
		
		Assert.assertEquals(text, "Invalid Login details or Your Password might have expired. Click here to reset your password");
		
		System.out.println("Login not success");
  
	}
	@When("user search for {string}")
	public void userSearchFor(String hotelname) throws AWTException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement select = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(select);
		s.selectByValue("Sydney");
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys(hotelname);
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys("Double");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

	@Then("hotel name should be retrived and logged out")
	public void hotelNameShouldBeRetrivedAndLoggedOut() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
//		Thread.sleep(1000);
//		String text = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();
//		Assert.assertEquals(text, "(1) Record Found");
//		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
	    
	}

}
