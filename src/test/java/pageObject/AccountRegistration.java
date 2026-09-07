package pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="FirstName")
	WebElement txtFirstname;
	@FindBy(id="LastName")
	WebElement txtLastname;
	@FindBy(id="Email")
	WebElement txtEmail;
	@FindBy(id="Password")
	WebElement txtPassword;
	@FindBy(id="ConfirmPassword")
	WebElement txtConfirmpassword;
	@FindBy(id = "gender-male")
	WebElement btnradioMale;
	@FindBy(id = "gender-female")
	WebElement btnradioFemale;
	@FindBy(id="register-button")
	WebElement btnregister;
	@FindBy(xpath="//div[@class='result']")
	WebElement confirmMsg;
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
		
	}
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
		
	}
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		
	}
	public void setConfirmPassword(String pwd) {
		txtConfirmpassword.sendKeys(pwd);
		
	}
	public void clickRadioMale() {
		btnradioMale.click();
		
	}
	public void clickRadioFemale() {
		btnradioFemale.click();
	}
	public void clickRegister() {
		btnregister.click();
	}
	public String getConfirmationMsg() {
		try {
			return (confirmMsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}
	
	
	

}
