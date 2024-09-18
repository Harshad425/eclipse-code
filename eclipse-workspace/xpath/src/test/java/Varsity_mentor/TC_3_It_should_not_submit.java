package Varsity_mentor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_3_It_should_not_submit {

	
	
WebDriver driver;
	
@BeforeMethod
void setup() {
	
 driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");
}

	@Test()
	void Fill_blank_value() throws InterruptedException {
	   
	 

		Thread.sleep(5000);
		WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
	    submitbutton.click();
		;

	  
	    

		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
	    // Alternatively, if you want to be more flexible with the text
	     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
	    String actualMessage = successMessageElement.getText();

	    // Print the actual message for debugging
	    System.out.println("Actual Message: " + actualMessage);

	    // Expected success message
	    String expectedMessage = "One or more fields have an error. Please check and try again.";
	    	

	    // Assert the success message
	    Assert.assertEquals(actualMessage, expectedMessage);
	}

	                                                                                                  
	 
	
	
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }}
}
	

