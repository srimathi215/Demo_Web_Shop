package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CartPage extends BasePage {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement cartlink;
	@FindBy(linkText="14.1-inch Laptop")
	WebElement productname;
	@FindBy(xpath="//span[@class='product-unit-price']")
	WebElement unitprice;
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement quantity;
	@FindBy(name="updatecart")
	WebElement updatecartbtn;
	@FindBy(name="removefromcart")
	WebElement removechbx;
	@FindBy(xpath="//span[@class='product-price order-total']")
	WebElement totalprice;
	@FindBy(id="termsofservice")
	WebElement termschbx;
	@FindBy(id="checkout")
	WebElement checkoutbtn;
	public void clickcartlink() {
		cartlink.click();
	}
	public String getProductName() {
		try {
			return productname.getText();
		} catch (Exception e) {
		 return e.getMessage();
		}
	}
	public String getUnitPrice() {
		try {
			return unitprice.getText();
		} catch (Exception e) {
		 return e.getMessage();
		}
	}
	public void setQuantity(String qwt) {
        quantity.clear();
        quantity.sendKeys(qwt);
    }
	public void updateCart() {
		updatecartbtn.click();
	}
	public String getTotal() {
		try {
			return totalprice.getText();
		} catch (Exception e) {
			 return e.getMessage();
		}
	}
	public void clickremove() {
		removechbx.click();
	}
	public void clickTermsService() {
		termschbx.click();
	}
	public void clickCheckout() {
		checkoutbtn.click();
	}
	  
	
	
	
	
	
	
	
	

}
