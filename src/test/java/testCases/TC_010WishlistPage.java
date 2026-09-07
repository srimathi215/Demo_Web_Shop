package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.ProductPage;
import pageObject.WishlistPage;
import testBase.BaseClass;

public class TC_010WishlistPage extends BaseClass {
	
	@Test(groups = {"sanity", "Reggersion", "master"})
public void verify_Wishlist() {
	login();
	 
	    WishlistPage wp=new WishlistPage(driver);
	    wp.clickwishlistlink();
	    wp.removechbx();
	    wp.clickUpdate();
	    AccountPage ap=new AccountPage(driver);
	    ap.searchtextfield(pro.getProperty("product2"));
	    ap.searchbutton();
	    ap.clickproduct2();
	    ProductPage pp=new ProductPage(driver);
	    pp.clickWishlist(); 
	    wp.clickwishlistlink();
	    Assert.assertTrue(wp.isproductDisplayed(),"product not displayed");
	    Assert.assertEquals(wp.getQuantity(), "1");
	    
}
}
