package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountPage;
import pageObject.OrderPage;
import testBase.BaseClass;

public class TC_012OrderHistory extends BaseClass {
	@Test(groups = {"master", "Reggersion"})
	public void verify_OrderHistory() {
	 try {
         logger.info("STARTING OF TC_012 ORDER HISTORY");

         login();

         AccountPage ap = new AccountPage(driver);

         ap.clickmyaccount();
         ap.clickOrders();

         OrderPage op = new OrderPage(driver);

         Assert.assertTrue(op.isOrderDisplayed(), "Order is not displayed in Order History"
         );

         op.clickDetails();

         logger.info("Order details displayed successfully");

     } catch (Exception e) {

         logger.error("TC_012 Order History failed", e);
         Assert.fail();

     }

     logger.info("FINISHED TC_012 ORDER HISTORY");
 }
}
