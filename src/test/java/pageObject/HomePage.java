package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(linkText="Register")
WebElement lnkRegister;
@FindBy(linkText="Log in")
WebElement lnkLogin;

public void clickRegister() {
	lnkRegister.click();
}
public void clickLogin() {
	lnkLogin.click();
}
public boolean isLoginLinkDisplayed() {
	try {
		return(lnkLogin.isDisplayed());
	} catch (Exception e) {
		return false;
	}

}
}
