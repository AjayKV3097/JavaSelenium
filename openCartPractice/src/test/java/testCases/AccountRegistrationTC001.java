package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HeaderPage;
import PageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTC001 extends BaseClass {

	@Test
	public void accountCreation() {
		// TODO Auto-generated method stub
		try {
			HeaderPage h = new HeaderPage(driver);
			h.clickMyAccount();
			h.clickRegister();
			log.info("************Clicked Register*************");
			RegistrationPage r = new RegistrationPage(driver);
			r.setFirstName(randomStrings().toUpperCase());
			r.setLastName(randomStrings().toUpperCase());
			r.setEmail(randomAlphaNumbers() + "@" + "gmail.com");
			r.setTelephone("9" + randomNumbers());
			String password = randomAlphaNumbers();
			r.setPassword(password);
			r.setConfirmPassword(password);
			r.clickAgree();
			r.clickContinue();
			String verifyMessage = r.verifyMessage();
			Assert.assertEquals(verifyMessage, "Your Account Has Been Created!");

		} catch (Exception e) {
			// TODO: handle exception
			log.error("Test failed");
			log.debug("Debug logs...");
			Assert.fail();
		}
		log.info("***********finished*********");
	}

}
