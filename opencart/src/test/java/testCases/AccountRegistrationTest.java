package testCases;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {
	
	
	
	
	@Test(groups = {"Regression","Master"})
	public void verify_account_registration() throws InterruptedException {
		logger.info("***************Starting TC001***************");
		try {
		HomePage h = new HomePage(driver);
		Thread.sleep(2000);
		h.clickMyAccount();
		h.clickRegister();
		logger.info("Navigated to Registration Page");
		AccountRegistrationPage a = new AccountRegistrationPage(driver);
		logger.info("Providing customer details");
		a.setFirstName(randomString().toUpperCase());
		a.setLastName(randomString().toUpperCase());
		a.setEmail(randomString()+"@gmail.com");
		a.setTelephone(randomNumbers());
		String password = randomAlphaNumeric();
		a.setPassword(password);
		a.setConfirmPassword(password);
		Thread.sleep(1000);
		a.setPrivacyPolicy();
		a.clickContinue();
		logger.info("Validating expected message..");
		String confirmationMsg = a.getConfirmationMsg();
		Assert.assertEquals(confirmationMsg, "Your Account Has Been Created!");
		}
		catch (Exception e) {
			// TODO: handle exception
			logger.error("Test failed");
			logger.debug("Debug logs...");
			Assert.fail();
		}
		logger.info("***********finished*********");
	}
	
	
}
