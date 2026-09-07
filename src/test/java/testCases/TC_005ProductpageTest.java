package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.ProductPage;
import testBase.BaseClass;

public class TC_005ProductpageTest extends BaseClass {
	@Test(groups = {"sanity", "Reggersion", "master"})
public void verifyProductpage() {
	try {
	logger.info("STATING OF TC005_PRODUCTPAGE");
	login();
	AccountPage ap=new AccountPage(driver);
	ap.searchtextfield(pro.getProperty("product"));
	ap.searchbutton();
	ap.clickproduct();
	ProductPage pp=new ProductPage(driver);
  Assert.assertEquals(pp.getProductName(),"14.1-inch Laptop");
  logger.info("VALIDATING PRODUCTNAME");
  Assert.assertEquals(pp.getProductPrice(), "1590.00");
  logger.info("VALIDATING PRODUCTPRICE");
  Assert.assertTrue(pp.isdisplayedQuantity(), "Quantity is not displayed");
  pp.clickAddToCart();
	}catch (Exception e) {
		e.getMessage();
		Assert.fail();
	}
	logger.info("FINISHED");
  
}
}
