package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends BasePage {

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//div[@class='order-list']")
    WebElement orderlist;

    @FindBy(xpath="//input[@value='Details']")
    WebElement detailsbtn;

    public boolean isOrderDisplayed() {
        try {
            return orderlist.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void clickDetails() {
        detailsbtn.click();
    }
}
	
	


