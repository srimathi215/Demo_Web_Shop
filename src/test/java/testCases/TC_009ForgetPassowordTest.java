package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ForgetpasswordPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_009ForgetPassowordTest  extends BaseClass{
	@Test(groups = {"sanity", "Reggersion", "master"})
 public void verify_forgetPassword() {
	 try {
	 logger.info("STARTING OF TC_009FORGESTPASSWORDTEST");
	 HomePage hp=new HomePage(driver);
	 hp.clickLogin();
	 LoginPage lp= new LoginPage(driver);
	 lp.clickforgetpassword();
	 ForgetpasswordPage fp=new ForgetpasswordPage(driver);
	 fp.setforgetpwsemail(pro.getProperty("email"));
	 fp.clickRecoverybtn();
	 Assert.assertTrue(fp.isRevoryMsgDisplayed(), "recovery msg not displayed");
	 }catch (Exception e) {
		e.getMessage();
		Assert.fail();
	}
	 logger.info("FINISHED");
	 
 }
}
