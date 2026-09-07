package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.CartPage;
import pageObject.ProductPage;
import testBase.BaseClass;

public class TC_006ShoppingCartTest extends BaseClass{
	@Test(groups = {"sanity", "Reggersion", "master"})
	public void verify_Shopping_cart() throws InterruptedException {
		try {
			logger.info("STARTING OF TC-006SHOPPINGCART");
		login();
		AccountPage ap=new AccountPage(driver);
		ap.searchtextfield(pro.getProperty("product"));
		ap.searchbutton();
		ap.clickproduct();
		ProductPage pp = new ProductPage(driver);
        pp.clickAddToCart();
		CartPage cp=new CartPage(driver);
		cp.clickcartlink();
		Assert.assertEquals(cp.getProductName(),"14.1-inch Laptop");
		logger.info("VALIDATING PRODUCTNAME");
		Assert.assertEquals(cp.getUnitPrice(),"1590.00");
		logger.info("VALIDATING PRODUCPRICE");
		//cp.clickremove();
		cp.setQuantity(pro.getProperty("quantity"));
		cp.updateCart();
		logger.info("UPDATECART");
		Assert.assertEquals(cp.getTotal(),"4770.00");
		}catch (Exception e) {
			e.getMessage();
			Assert.fail();
		}
	logger.info("FINISHED");
		
	}

}
