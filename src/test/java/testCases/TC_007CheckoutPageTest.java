package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.CartPage;
import pageObject.CheckoutPage;
import pageObject.ProductPage;
import testBase.BaseClass;

public class TC_007CheckoutPageTest extends BaseClass {
	@Test(groups = {"sanity", "Reggersion", "master"})
	public void verify_CheckOutPage() throws InterruptedException {
		try {
	logger.info("STARTING OF TC-007CHECKOUT");
	login();
	AccountPage ap=new AccountPage(driver);
	ap.searchtextfield(pro.getProperty("product"));
	ap.searchbutton();
	ap.clickproduct();
	ProductPage pp = new ProductPage(driver);
    pp.clickAddToCart();
	CartPage cp=new CartPage(driver);
	cp.clickcartlink();cp.setQuantity(pro.getProperty("quantity"));
	cp.updateCart();
	cp.clickTermsService();
	cp.clickCheckout();
	CheckoutPage ch=new CheckoutPage(driver);
	ch.selectnewaddress(pro.getProperty("newaddrs"));
	ch.setcompany(randomeString().toUpperCase());
	ch.selectcountry(pro.getProperty("country"));
	ch.setcity(randomeString().toUpperCase());
	ch.setaddress1(randomeString().toUpperCase());
	ch.setaddress2(randomeString().toUpperCase());
	ch.setZipCode(randomnum());
	ch.setphnum(randomnum());
	ch.setfaxnum(randomnum());
	Thread.sleep(1000);
	ch.clickBillingaddrscontinue();
	ch.clickShippingaddrscontinue();
	ch.clickShippingMethodcontinue();
	ch.clickPaymentmethodcontinue();
	ch.clickPaymentInfocontinue();
	Thread.sleep(1000);
	ch.clickConfirm();
	Thread.sleep(2000);
	Assert.assertTrue(ch.orderConfirmMsg(), "confirmation msg is not displayed");
		}catch (Exception e) {
		    e.getMessage();
		    Assert.fail();
		}
		logger.info("FINISHED");
	
	}

}
