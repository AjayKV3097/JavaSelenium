package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HeaderPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.RegistrationPage;
import PageObjects.productsPage;
import testBase.BaseClass;

public class EndToEnd extends BaseClass {
	
	@Test(priority=1,groups={"Master"})
	public void EndToEndTestCase(){
		try {
			HeaderPage h = new HeaderPage(driver);
			h.clickMyAccount();
			h.clickRegister();
			log.info("************Clicked Register*************");
			RegistrationPage r = new RegistrationPage(driver);
			r.setFirstName(randomStrings().toUpperCase());
			r.setLastName(randomStrings().toUpperCase());
			String email = randomAlphaNumbers()+ "@" + "gmail.com";
			r.setEmail(email);
			r.setTelephone("9" + randomNumbers());
			String password = randomAlphaNumbers();
			r.setPassword(password);
			r.setConfirmPassword(password);
			r.clickAgree();
			r.clickContinue();
			String verifyMessage = r.verifyMessage();
			Assert.assertEquals(verifyMessage, "Your Account Has Been Created!");
			r.clickLogout();
			r.clickContinue2();
			h.clickMyAccount();
			h.clickLogin();
			LoginPage l = new LoginPage(driver);
			prop.setProperty("email1", email);
			prop.setProperty("password1", password);
			l.setEmail(prop.getProperty("email1"));
			l.setPassword(prop.getProperty("password1"));
			l.clickLogin();
			MyAccountPage a = new MyAccountPage(driver);
			boolean verifyMyAccountPage = a.verifyMyAccountPage();
			Assert.assertTrue(verifyMyAccountPage);
			productsPage p = new productsPage(driver);
			p.clickTablet();
			p.clickSamsungTablet();
			Thread.sleep(30000);
			p.clickAddToCart();
//			String verifyMessage2 = p.verifyMessage();
	//		Assert.assertEquals(verifyMessage2, "Success: You have added Samsung Galaxy Tab 10.1 to your shopping cart!");
			Thread.sleep(20000);
			p.clickCart();
			p.clickCheckout();
			Thread.sleep(20000);
			String verifyAmount = p.verifyAmount();
			Assert.assertEquals(verifyAmount, "$241.99");
			h.clickMyAccount();
			p.clickLogout();
			p.clickContinue();
		} catch (Exception e) {
			// TODO: handle exception
			log.error("Test failed");
			log.debug("Debug logs...");
			Assert.fail();
		}
		log.info("***********finished*********");
	}
	
		
	

}
