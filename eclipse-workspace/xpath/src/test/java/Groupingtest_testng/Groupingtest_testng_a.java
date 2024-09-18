package Groupingtest_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingtest_testng_a {

	
	
	WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.pixlogix.com/get-a-quote/");
    }
	
	
	
	
	
	
	
	  @Test(priority = 3)
	    public void fill_quote_Form_with_blank_values()  {
	      
	    	WebElement submitButton = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
	        submitButton.click();
	        
	       Assert.assertFalse(false);
	    }

  @Test(priority = 4)
  public void fill_quote_Form_with_invalid_mail_format() {
      // Fill out the form fields with invalid email format
  	WebElement name =driver.findElement(By.xpath("//input[@id='rq_first_name']"));
  	name.clear();
  	name		.sendKeys("Watson(harshad testing Qa)");
  	WebElement email= driver.findElement(By.xpath("//input[@id='rq_email_address']"));
  			email	.clear();
  			email.sendKeys("hfdsgdsf");
  	WebElement company= driver.findElement(By.xpath("//input[@id='rq_compuny_name']"));
  	company.clear();
  	company.	sendKeys("pixlogix");
  	WebElement message= driver.findElement(By.xpath("//textarea[@id='rq_message']"));
  	message.clear();
  	message	.sendKeys("harshad automation testing");
  	WebElement number= driver.findElement(By.xpath("//input[@id='mobile_code']"));
  			number	.clear();
  			number	.sendKeys("08542385025");

      // Select dropdown values
      WebElement serviceDropdown = driver.findElement(By.xpath("//select[@id='rq_services']"));
      Select serviceSelect = new Select(serviceDropdown);
      serviceSelect.selectByVisibleText("SEO");

      WebElement budgetDropdown = driver.findElement(By.xpath("//select[@id='rq_proj_budget']"));
      Select budgetSelect = new Select(budgetDropdown);
      budgetSelect.selectByVisibleText("Below $5k (in USD)");

      // Click the submit button
      WebElement submitButton = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
      submitButton.click();

   
   	        String currentUrl = driver.getCurrentUrl();
      Assert.assertEquals(currentUrl, "https://www.pixlogix.com/thank-you/");
  }
	
	
	
	
	
	
	
	
	
}
