package addactInnApplication;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.DriverInit;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingPage extends DriverInit {
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
