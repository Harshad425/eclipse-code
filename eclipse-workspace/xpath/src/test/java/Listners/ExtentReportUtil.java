package Listners;

public class ExtentReportUtil {

    private static Exports extent;
    private static ExtendedRequest test;
    
    public static void setupReport() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Test Report");

        extent = new Exports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "Your Host Name");
        extent.setSystemInfo("Environment", "Test Environment");
        extent.setSystemInfo("User Name", "Your Name");
    }

    public static void createTest(String testName, String description) {
        test = extent.createTest(testName, description);
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void log(Status status, String details) {
        test.log(status, details);
    }

    public static void flushReport() {
        extent.flush();
    }
}
Step 3: Create BaseTest Class
Create a base test class named BaseTest.java:

java
Copy code
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setupReport() {
        ExtentReportUtil.setupReport();
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void flushReport() {
        ExtentReportUtil.flushReport();
    }
}
Step 4: Create LoginTest Class
Create a test class named LoginTest.java:

java
Copy code
import com.aventstack.extentreports.Status;

import java.lang.module.ModuleDescriptor.Exports;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        ExtentReportUtil.createTest("Login Test", "Test to validate login functionality");

        driver.get("https://example.com/login");
        ExtentReportUtil.log(Status.INFO, "Navigated to login page");

        driver.findElement(By.id("username")).sendKeys("your-username");
        ExtentReportUtil.log(Status.INFO, "Entered username");

        driver.findElement(By.id("password")).sendKeys("your-password");
        ExtentReportUtil.log(Status.INFO, "Entered password");

        driver.findElement(By.id("loginButton")).click();
        ExtentReportUtil.log(Status.INFO, "Clicked login button");

        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Login test failed");
        ExtentReportUtil.log(Status.PASS, "Login test passed");
    }