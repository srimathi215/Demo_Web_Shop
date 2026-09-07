package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_008LogoutTest extends BaseClass {
	@Test(groups = {"sanity", "Reggersion", "master"})
	public void verify_Logout()  {

	    logger.info("STARTING OF TC-008 LOGOUT");

	    login();

	    AccountPage ap = new AccountPage(driver);

	    ap.clickLogout();
	    HomePage hp=new HomePage(driver);

	    Assert.assertTrue(
	        hp.isLoginLinkDisplayed(),
	        "Logout was not successful"
	    );

	    logger.info("FINISHING OF TC-008 LOGOUT");
	}

}
