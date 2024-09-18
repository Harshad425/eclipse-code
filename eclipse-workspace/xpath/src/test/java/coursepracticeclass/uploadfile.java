package coursepracticeclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class uploadfile {

	
		

	

	

		public class Contactformtest {

		    WebDriver driver;

		    @BeforeClass
		    void setup() {
		        // Set up WebDriver
		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    }

		    @Test(priority = 1)
		    void positiveCase() {
		        driver.get("https://www.pixlogix.com/careers/php-team-lead/");
		        
		        // Fill out the form with valid data
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']")).sendKeys("Watson");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Age']")).sendKeys("25");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Current Location']")).sendKeys("parth");
		        driver.findElement(By.xpath("//input[@placeholder='Notice Period']")).sendKeys("parth");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("12345236745");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']")).sendKeys("Test@gmail.com");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Linkedin Profile URL']")).sendKeys("linkdynid.com");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Current CTC']")).sendKeys("30k");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Expected CTC']")).sendKeys("40k");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Skills']")).sendKeys(
		                "Lorem ipsume test");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Personal Attribute']")).sendKeys(
		                "Dummy content for a test");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Message To HR']")).sendKeys(
		                "This is for automation testing");
		        
		        // Upload resume (replace with your actual file path)
		        WebElement uploadResume = driver.findElement(By.cssSelector(".wpcf7-drag-n-drop-file"));
		        uploadResume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Who We Are.docx");
		        
		        // Select dropdown values
		        Select qualification = new Select(driver.findElement(By.xpath("//select[@name='qualification-menu']")));
		        qualification.selectByVisibleText("B.A");
		        
		        Select gender = new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		        gender.selectByVisibleText("Male");
		        
		        Select experience = new Select(driver.findElement(By.xpath("//select[@name='experience']")));
		        experience.selectByVisibleText("Fresher");
		        
		        // Click Apply Now button
		        WebElement applyNowButton = driver.findElement(By.xpath("//button[normalize-space()='Apply Now']"));
		        applyNowButton.click();
		        
		        // Add explicit wait for success message (uncomment if needed)
//		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		        WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//div[contains(text(), 'Thank you for your message.')]")));
//		        String actualMessage = successMessageElement.getText();
//		        String expectedMessage = "Thank you for your message. It has been sent.";
//		        Assert.assertEquals(actualMessage, expectedMessage);
		    }

		    @Test(priority = 2)
		    void blankData() {
		        driver.get("https://www.pixlogix.com/careers/php-team-lead/");
		        
		        // Fill out the form with blank data
		        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']"));
		        fullName.clear();
		        fullName.sendKeys("");
		        
		        // Similar approach for other fields...
		        
		        // Click Apply Now button
		        WebElement applyNowButton = driver.findElement(By.xpath("//button[normalize-space()='Apply Now']"));
		        applyNowButton.click();
		        
		        // Add explicit wait for error message (uncomment if needed)
//		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//div[contains(text(), 'One or more fields have an error')]")));
//		        String actualMessage = errorMessageElement.getText();
//		        String expectedMessage = "One or more fields have an error. Please check and try again.";
//		        Assert.assertEquals(actualMessage, expectedMessage);
		    }

		    @Test(priority = 3)
		    void invalidEmail() {
		        driver.get("https://www.pixlogix.com/careers/php-team-lead/");
		        
		        // Fill out the form with invalid email
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']")).sendKeys("Watson");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Age']")).sendKeys("25");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Current Location']")).sendKeys(
		                "parth");
		        driver.findElement(By.xpath("//input[@placeholder='Notice Period']")).sendKeys(
		                "parth");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys(
		                "12345236745");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']"))
		                .sendKeys("gygjhk");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Linkedin Profile URL']"))
		                .sendKeys("linkdynid.com");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Current CTC']"))
		                .sendKeys("30k");
		        driver.findElement(By.xpath("//input[@placeholder='Enter Your Expected CTC']"))
		                .sendKeys("40k");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Skills']"))
		                .sendKeys("Lorem ipsume test");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Personal Attribute']"))
		                .sendKeys("Dummy content for a test");
		        driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Message To HR']"))
		                .sendKeys("This is for automation testing");
		        
		        // Upload resume (replace with your actual file path)
		        WebElement uploadResume = driver.findElement(By.cssSelector(".wpcf7-drag-n-drop-file"));
		        uploadResume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Who We Are.docx");
		        
		        // Select dropdown values
		        Select qualification = new Select(driver.findElement(By.xpath("//select[@name='qualification-menu']")));
		        qualification.selectByVisibleText("B.A");
		        
		        Select gender = new Select(driver.findElement(By.xpath("//select[@name='gender']")));
		        gender.selectByVisibleText("Male");
		        
		        Select experience = new Select(driver.findElement(By.xpath("//select[@name='experience']")));
		        experience.selectByVisibleText("Fresher");
		        
		        // Click Apply Now button
		        WebElement applyNowButton = driver.findElement(By.xpath("//button[normalize-space()='Apply Now']"));
		        applyNowButton.click();
		        
		        // Add explicit wait for error message (uncomment if needed)
//		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//div[contains(text(), 'One or more fields have an error')]")));
//		        String actualMessage = errorMessageElement.getText();
//		        String expectedMessage = "One or more fields have an error. Please check and try again.";
//		        Assert.assertEquals(actualMessage, expectedMessage);
		    }

		    @AfterClass
		    void teardown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    
		    
		
}
		}}