package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="Email")
	WebElement txtEmail;
	@FindBy(id="Password")
	WebElement txtPassword;
	@FindBy(xpath="//input[@value='Log in']")
	WebElement btnLoginin;
	@FindBy(linkText="Forgot password?")
	WebElement forgetpwdlnk;
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void clickLogin() {
		btnLoginin.click();
	}
	public void clickforgetpassword() {
		forgetpwdlnk.click();
	}
	
	
	

}
