package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	
	@Test(groups = {"Sanity","Master"})
	
	public void verifyLogin() {
		// TODO Auto-generated method stub
		logger.info("***************Starting TC002***************");
		try {
		HomePage p = new HomePage(driver);
		p.clickMyAccount();
		p.clickLogin();
		Thread.sleep(1000);
		LoginPage l = new  LoginPage(driver);
		l.setEmail(prop.getProperty("email"));
		l.setPassword(prop.getProperty("password"));
		l.clickLogin();
		MyAccount a = new MyAccount(driver);
		boolean verifyMyAccountPage = a.verifyMyAccountPage();
		Assert.assertTrue(verifyMyAccountPage);
		}
		catch (Exception e) {
			// TODO: handle exception
			Assert.fail();
			logger.info("***************Ending TC002***************");
		}
	}
}
