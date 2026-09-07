package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
	
	public AccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement myacountlnk;
	@FindBy(linkText="Log out")
	WebElement logoutlink;
	@FindBy(id="small-searchterms")
	WebElement searchtxtf;
	@FindBy(xpath="//input[@value='Search']")
	WebElement searchbtn;
	@FindBy(linkText="14.1-inch Laptop")
	WebElement productname;
	@FindBy(linkText="Health Book")
	WebElement productname2;
	@FindBy(linkText="Change password")
	WebElement changepwdlnk;
	@FindBy(id="OldPassword")
	WebElement oldpwdtxf;
	@FindBy(id="NewPassword")
	WebElement newpwdtxf;
	@FindBy(id="ConfirmNewPassword")
	WebElement confpwdtxf;
	@FindBy(xpath="//input[@value='Change password']")
	WebElement changepwdbtn;
	@FindBy(xpath="//div[@class='result']")
	WebElement pwdchangemsg;
	@FindBy(linkText="Orders")
	WebElement orderslnk;
	public boolean isMyAccountPageExists() {
		try {
			return(logoutlink.isDisplayed());
			
		} catch (Exception e) {
			return false;
		}}
 public void clickLogout() {
	logoutlink.click();
}
 public void searchtextfield(String product) {
		searchtxtf.sendKeys(product);
 }
 public void searchbutton() {
	 searchbtn.click();
	
}
 public boolean isproductisdisplayed() {
	try {
		return(productname.isDisplayed());
	} catch (Exception e) {
		return false;
	}
}
 public void clickproduct() {
	productname.click();
}
 
 public void clickproduct2() {
		productname2.click();
	}
 public void clickmyaccount() {
	myacountlnk.click();
}
 public void changepassword() {
	changepwdlnk.click();
}
 public void setOldPassword(String oldPassword) {
	    oldpwdtxf.sendKeys(oldPassword);
	}

	public void setNewPassword(String newPassword) {
	    newpwdtxf.sendKeys(newPassword);
	}

	public void setConfirmPassword(String confirmPassword) {
	    confpwdtxf.sendKeys(confirmPassword);
	}
	public void clickingchangepassword() {
	    changepwdbtn.click();
	}
	public boolean ispasswordchangemsgDsiplayed() {
		return pwdchangemsg.isDisplayed();
		
	}
	public void clickOrders() {
		orderslnk.click();
	}
}
