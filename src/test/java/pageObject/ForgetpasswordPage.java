package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetpasswordPage  extends BasePage{

	public ForgetpasswordPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(id="Email")
	WebElement forgetpwdemailtxf;
	@FindBy(name="send-email")
	WebElement recoverbtn;
	@FindBy(xpath="//div[@class='result']")
	WebElement recoveremail;
	
	public void setforgetpwsemail(String email) {
		forgetpwdemailtxf.sendKeys(email);
	}
	public void clickRecoverybtn() {
		recoverbtn.click();
	}
	public boolean isRevoryMsgDisplayed() {
		return recoveremail.isDisplayed();
		
	}
	

}
