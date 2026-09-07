package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends BasePage  {

	public WishlistPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//span[@class='cart-label' and text()='Wishlist']")
WebElement wishlistlnk;
@FindBy(linkText="Health Book")
WebElement productname;
@FindBy(xpath="//input[@class='qty-input']")
WebElement quantity;
@FindBy(name="removefromcart")
WebElement removechbx;
@FindBy(name="updatecart")
WebElement updatebtn;
public void clickwishlistlink() {
	wishlistlnk.click();
}
public boolean isproductDisplayed() {
	return productname.isDisplayed();
	
}
public String getQuantity() {
    return quantity.getAttribute("value");
}
public void removechbx() {
	removechbx.click();
}
public void clickUpdate() {
	updatebtn.click();
}
}
