package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003LoginDDT extends BaseClass{
	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class,groups ={"Datadriven","sanity","master"})
	public void verify_loginDDT(String email,String pwd,String exp) throws Exception {
		
		logger.info("*****STARTING TC_003_LoginDTT ***");
		try {
		//homepage
		HomePage hp= new HomePage(driver);
		hp.clickLogin();
		//login
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		//myaccount
		AccountPage ap=new AccountPage(driver);
		boolean targetpage = ap.isMyAccountPageExists();
		/*Data is valid --- login sucess-- test pass--logout
		                     login failed--test fail
		 Datais invalid--- login sucess --test fail--logout
		                   login failed--test pass
		 */
		if (exp.equalsIgnoreCase("valid")) {
			if (targetpage==true) {
				ap.clickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		if (exp.equalsIgnoreCase("invalid")) {
			if (targetpage==true) {
				ap.clickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}
		
		}catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		logger.info("FINISHED");
		Thread.sleep(1000);
	}
	
		
	
	
	

}
