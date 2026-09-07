package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//h1[@itemprop='name']")
	WebElement productname;
	@FindBy(xpath="//span[@itemprop='price']")
	WebElement productprice;
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement quantitytxf;
	@FindBy(id="add-to-cart-button-31")
	WebElement addtocartbtn;
	@FindBy(id="add-to-wishlist-button-22")
	WebElement wishlistbtn;
	public String getProductName() {
		try {
		return productname.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	public String getProductPrice() {
		try {
		return productprice.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	public boolean isdisplayedQuantity() {
      return quantitytxf.isDisplayed();
    }

    public void clickAddToCart() {
        addtocartbtn.click();
    }
    public void clickWishlist() {
		wishlistbtn.click();
	}

}
