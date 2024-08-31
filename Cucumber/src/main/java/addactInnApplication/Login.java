package addactInnApplication;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.DriverInit;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends DriverInit {
	
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

}
