package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id ="billing-address-select")
	WebElement newAddressdrpdwn;
	@FindBy(id="BillingNewAddress_Company")
	WebElement companytxf;
	@FindBy(id="BillingNewAddress_CountryId")
	WebElement countydrpdwn;
	@FindBy(id="BillingNewAddress_City")
	WebElement citytxf;
	@FindBy(id="BillingNewAddress_Address1")
	WebElement addrs1;
	@FindBy(id="BillingNewAddress_Address2")
	WebElement addrs2;
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	WebElement zipcodetxf;
	@FindBy(id="BillingNewAddress_PhoneNumber")
	WebElement phonenumtxf;
	@FindBy(id="BillingNewAddress_FaxNumber")
	WebElement faxnumtxf;
	@FindBy(xpath="//input[@value='Continue' and contains(@onclick,'Billing')]")
	WebElement BAcontinuebtn;
	@FindBy(xpath="//input[@value='Continue' and contains(@onclick,'Shipping.save()')]")
	WebElement SAcontinuebtn;
	@FindBy(xpath="//input[@value='Continue' and contains(@onclick,'ShippingMethod.save()')]")
	WebElement SMcontinuebtn;
	@FindBy(xpath="//input[@value='Continue' and contains(@onclick,'PaymentMethod.save()')]")
	WebElement PMcontinuebtn;
	@FindBy(xpath="//input[@value='Continue' and contains(@onclick,'PaymentInfo.save()')]")
	WebElement PIcontinuebtn;
	@FindBy(xpath="//input[@value='Confirm' and contains(@onclick,'ConfirmOrder.save()')]")
	WebElement confirmbtn;
	@FindBy(xpath="//div[@class='title']")
	WebElement confirmmsg;
	public void selectnewaddress( String newdrop) {
		Select sel=new Select(newAddressdrpdwn);
		sel.selectByVisibleText(newdrop);
	}
	public void setcompany(String cmp) {
		companytxf.sendKeys(cmp);
	}
	public void selectcountry(String cnty) {
		Select sel =new Select(countydrpdwn);
		sel.selectByVisibleText(cnty);
	}
	public void setcity(String cty) {
		citytxf.sendKeys(cty);
	}
	public void setaddress1(String add1){
		addrs1.sendKeys(add1);
		
	}
	public void setaddress2(String add2){
		addrs2.sendKeys(add2);
		
	}
	public void setZipCode(String zipcode) {
		zipcodetxf.sendKeys(zipcode);
		
	}
	public void setphnum(String pnum) {
		phonenumtxf.sendKeys(pnum);
		
	}
	public void setfaxnum(String fnum) {
		faxnumtxf.sendKeys(fnum);
		
	}
	public void clickBillingaddrscontinue(){
		BAcontinuebtn.click();
		
	}
	public void clickShippingaddrscontinue(){
		SAcontinuebtn.click();
		
	}
	public void clickShippingMethodcontinue(){
		SMcontinuebtn.click();
		
	}
	public void clickPaymentmethodcontinue(){
		PMcontinuebtn.click();
		
	}
	public void clickPaymentInfocontinue(){
		PIcontinuebtn.click();
		
	}
	public void clickConfirm(){
		confirmbtn.click();
		
	}
	public boolean orderConfirmMsg() {
		return confirmmsg.isDisplayed();
	}
	
	
	
	
	
	

}
