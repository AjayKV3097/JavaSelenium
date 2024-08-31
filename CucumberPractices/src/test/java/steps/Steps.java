package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInit;

public class Steps extends DriverInit {
	@And("when user enters username as {string}")
	public void when_user_enters_username_as(String uname) {
		driver.findElement(By.name("username")).sendKeys(uname);
	}

	@And("when user enters password as {string}")
	public void when_user_enters_password_as(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}

	@When("user search for {string}")
	public void user_search_for(String hotel) {
		WebElement select = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(select);
		s.selectByValue("Sydney");
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys(hotel);
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys("Double");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}

	@Then("hotel name should be retrived and logged out")
	public void hotel_name_should_be_retrived_and_logged_out() {
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

}
