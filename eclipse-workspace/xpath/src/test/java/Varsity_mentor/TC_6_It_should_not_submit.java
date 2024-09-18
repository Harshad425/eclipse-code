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

public class TC_6_It_should_not_submit { 

	
	
	
	
	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		
	 driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");
	}

		@Test()
		void Error_message_check_is_coming_or_not() throws InterruptedException {
		   
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
Thread.sleep(5000);
WebElement submitbutton = driver.findElement(By.xpath("//button[contains(@class, 'theme-btn') or contains(text(), 'Submit')]"));
   submitbutton.click();

		  
		    

			
		     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
		    String actualMessage = successMessageElement.getText();

		    // Expected success message
		    Thread.sleep(5000);
		    String expectedMessage = "One or more fields have an error. Please check and try again.";
		    	

		    // Assert the success message
		    Assert.assertEquals(actualMessage, expectedMessage);
		}

}    
		    
		    
		  

		
		
		
	
	
	
	
	
	
	

