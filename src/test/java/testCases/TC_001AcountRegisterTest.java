package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistration;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001AcountRegisterTest extends BaseClass {
 
	@Test(groups = {"sanity","Reggersion","master"}) 
	public void verify_account_registration() {
    	 try {
    		 logger.info("****START TC_001 ACCOUNT TEGISTRATION***");
    	 HomePage hp =new HomePage(driver); 
		 hp.clickRegister();
		 logger.info("CLICK ON REGISTER LINK");
		 AccountRegistration  regpage= new AccountRegistration(driver);
		 regpage.setFirstName(randomeString().toUpperCase());
		 regpage.setLastName(randomeString().toUpperCase());
		 regpage.setEmail(randomeString()+"@gmail.com");
		 String password = randomalpha();
		 regpage.setPassword(password);
		 regpage.setConfirmPassword(password);
		 regpage.clickRadioMale();
		 regpage.clickRegister();
		 logger.info("PROVIDE VALID DETAILS AND CLICK REGISTER");
		 logger.info("VALIDATING EXPECTED MESSAGE");
		 String confMsg = regpage.getConfirmationMsg();
		 if (confMsg.equals("Your registration completed")) {
			 logger.info("TESTCASE PASSED");
		}else {
			    logger.error("TESTCASE FAILED - Confirmation message mismatch");
			    Assert.fail();
		} 
		// Assert.assertEquals(confMsg,"Your registration completed");
    	 }catch (Exception e) {
    			    logger.error("TESTCASE FAILED due to exception", e);
    			    Assert.fail();
		}
    	 logger.info("FINISHED");
	 }
     

}
