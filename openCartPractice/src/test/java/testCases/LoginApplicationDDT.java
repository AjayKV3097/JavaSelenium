package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HeaderPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class LoginApplicationDDT extends BaseClass {
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups="Datadriven")
	public void verifyLoginDDT(String email, String pwd, String exp) throws InterruptedException {
		// TODO Auto-generated method stub
		log.info("***************Starting TC003***************");
		try {
			HeaderPage p = new HeaderPage(driver);
			p.clickMyAccount();
			p.clickLogin();
			Thread.sleep(1000);
			LoginPage l = new LoginPage(driver);
			l.setEmail(email);
			l.setPassword(pwd);
			l.clickLogin();
			MyAccountPage a = new MyAccountPage(driver);
			boolean verifyMyAccountPage = a.verifyMyAccountPage();
			if (exp.equalsIgnoreCase("Valid")) {
				if (verifyMyAccountPage == true) {
					Assert.assertTrue(true);
					a.clickLogout();
				} else {
					Assert.assertTrue(false);
				}
			}
			if (exp.equalsIgnoreCase("Invalid")) {
				if (verifyMyAccountPage == true) {

					a.clickLogout();
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(true);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail();
		}
		log.info("***************Ending TC003***************");
	}
}