 package testBase;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;//log4j
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObject.HomePage;
import pageObject.LoginPage;
import utilities.ExtentReportManager;

public class BaseClass {
	public	WebDriver driver;
	 public Logger logger;//log4j
	 public Properties pro;
	// Extent Report objects 
	 public static ExtentReports extent; 
	 public ExtentTest test;
	 
    @BeforeClass(groups = {"sanity","Reggersion","master"})
    @Parameters({"os","browser"})
	public void lanuchBrowser( String os,String br) throws Exception {
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");
    	options.addArguments("--disable-features=PasswordLeakDetection");
    	options.addArguments("--incognito");

    	java.util.HashMap<String, Object> prefs = new java.util.HashMap<>();

    	prefs.put("credentials_enable_service", false);

    	//loding commondata in properties file
			FileInputStream fis=new FileInputStream("./src//test//resources//commondata.properties");
			 pro=new Properties();
			pro.load(fis);
		
    	
    	logger=LogManager.getLogger(this.getClass());
    	// EXTENT REPORT INITIALIZATION //
    	if (extent == null) 
    	{ 
    		extent = ExtentReportManager.getReportObject(); }
    	
    	switch (br.toLowerCase()) {
		case "chrome":driver=new ChromeDriver(options);break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
	default:System.out.println("invalid nrowser name"); return;
		}
    	
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();	 
	 }
 // CREATE EXTENT TEST // 
    @BeforeMethod 
    public void startTest(Method method) {

        test = extent.createTest(method.getName());

        test.info("Test execution started");
    }
 // FAILURE SCREENSHOT

 @AfterMethod
 public void captureFailureScreenshot(ITestResult result) throws Exception {

     if (result.getStatus() == ITestResult.FAILURE) {

         String testName = result.getName();

         String screenshotPath =
                 ExtentReportManager.captureScreen(driver, testName);

         test.fail("Test Failed");

         test.fail(result.getThrowable());

         test.addScreenCaptureFromPath(screenshotPath);

         System.out.println(
                 "Failed Test Screenshot: " + screenshotPath);
     }
 }

    
    
    @AfterClass(groups = {"sanity","Reggersion","master"})
	public void CloseBrowser() {
		driver.quit(); 
		// Flush Extent Report
		if (extent != null) 
		{
			extent.flush();
			}
    }
    public String randomeString() { 
        String generatedstring= RandomStringUtils.randomAlphabetic(5);
    	return generatedstring;	
    	}
         public String randomalpha() {
        	 String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(6);
    		 return randomAlphanumeric;
    	}
       
		public String randomnum() {
	String randomnumber=RandomStringUtils.randomNumeric(10);
	return randomnumber;
	
		}
         
		 public void login() {

        	    HomePage hp = new HomePage(driver);
        	    hp.clickLogin();

        	    LoginPage lp = new LoginPage(driver);
        	    lp.setEmail(pro.getProperty("email"));
        	    lp.setPassword(pro.getProperty("password"));
        	    lp.clickLogin();
        	}
         

}
