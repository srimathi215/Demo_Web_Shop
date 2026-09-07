package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import testBase.BaseClass;

public class TC_004SearchingProductTest extends BaseClass {
@Test(groups = {"sanity", "Reggersion", "master"})
public void searchproduct() {

	//HOMEPAGE
	try {
		logger.info("TC004SEARCHING PRODUCT STARTED");
    login();
    //searchproduct
    AccountPage ap=new AccountPage(driver);
    ap.searchtextfield(pro.getProperty("product"));
    ap.searchbutton();
    Assert.assertTrue(ap.isproductisdisplayed(), "Product is not displayed");
    logger.info("product serach verified successfully");
    ap.clickproduct();
}
catch (Exception e) {
	e.getMessage();
	Assert.fail();
	
}
	logger.info("FINISHED");
    
}

}
