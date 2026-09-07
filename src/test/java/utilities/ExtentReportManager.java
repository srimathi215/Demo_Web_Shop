
package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReportObject() {

        // Separate report for every run
        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date());

        String path = System.getProperty("user.dir")
                + "\\Reports\\ExtentReport_" + dateTime + ".html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        reporter.config().setReportName("Demo Web Shop Automation Report");
        reporter.config().setDocumentTitle("Test Execution Report");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Project Name", "Demo Web Shop");
        extent.setSystemInfo("Testing Type", "Automation Testing");
        extent.setSystemInfo("Tester", "Srimathi");
        extent.setSystemInfo("Browser", "Chrome");
        extent.setSystemInfo("OS", "Windows");

        return extent;
    }

    public static String captureScreen(WebDriver driver, String testName)
            throws Exception {

        // Reports/screenshots folder path
        String screenshotDir = System.getProperty("user.dir")
                + "\\Reports\\screenshots";

        // Create folder automatically
        File folder = new File(screenshotDir);

        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Date and time
        String dateTime = new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new Date());

        // Screenshot file path
        String screenshotPath = screenshotDir
                + "\\" + testName + "_" + dateTime + ".png";

        // Take screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        File destination = new File(screenshotPath);

        FileUtils.copyFile(source, destination);

        System.out.println("Screenshot saved: " + screenshotPath);

        return screenshotPath;
    }
}
