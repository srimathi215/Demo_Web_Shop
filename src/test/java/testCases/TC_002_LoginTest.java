package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_002_LoginTest  extends BaseClass{
	@Test(groups ={"sanity","master"})
	public void verify_login() {
		logger.info("*****STARTING TC_002_LoginTest ***");
		try {
		//homepage
		HomePage hp= new HomePage(driver);
		hp.clickLogin();
		//login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(pro.getProperty("email"));
		lp.setPassword(pro.getProperty("password"));
		lp.clickLogin();
		//muaccount
		AccountPage ap=new AccountPage(driver);
		boolean targetpage = ap.isMyAccountPageExists();
		Assert.assertTrue(targetpage);
		logger.info("MY ACCOUNT PAGE IS DISPLAYED");
		}catch (Exception e) {
			Assert.fail();
		}
		logger.info("FINISHED");
	}
	
	

}
