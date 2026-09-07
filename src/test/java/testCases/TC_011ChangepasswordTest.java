package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import testBase.BaseClass;

public class TC_011ChangepasswordTest  extends BaseClass{
	@Test(groups = {"master"})
public void verify_Changepassword() {
	logger.info("STARTING OF TC011CHANGEPASSWORDTEST");
	login();
	AccountPage ap =new AccountPage(driver);
	ap.clickmyaccount();
	ap.changepassword();
	ap.setOldPassword(pro.getProperty("password"));
	ap.setNewPassword(pro.getProperty("password2"));
	ap.setConfirmPassword(pro.getProperty("password2"));
	ap.clickingchangepassword();
	Assert.assertTrue(ap.ispasswordchangemsgDsiplayed(), "password change msg not displayed");
	
}
}
