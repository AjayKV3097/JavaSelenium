package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HeaderPage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginApplication extends BaseClass {
	@Test
	public void loginApllication() {
		// TODO Auto-generated method stub
		try {
			HeaderPage h = new HeaderPage(driver);
			h.clickLogin();
			LoginPage l = new LoginPage(driver);
			l.setEmail(prop.getProperty("email"));
			l.setPassword(prop.getProperty("password"));
			l.clickLogin();
			MyAccountPage a = new MyAccountPage(driver);
			boolean verifyMyAccountPage = a.verifyMyAccountPage();
			Assert.assertTrue(verifyMyAccountPage);
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail();
			log.info("***************Ending TC002***************");
		}

	}

}
