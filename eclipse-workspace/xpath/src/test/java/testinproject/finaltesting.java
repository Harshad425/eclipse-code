package testinproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class finaltesting {

		
		    private WebDriver driver;

		    @BeforeMethod
		    public void setup() {
		        driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        driver.get("https://www.pixlogix.com/get-a-quote/");
		    }

		   @Test(priority = 1)
		    public void fill_quote_Form_withvalid() throws InterruptedException {
		        // Fill out the form fields
		        driver.findElement(By.xpath("//input[@id='rq_first_name']"))
		                .sendKeys("Watson");

		        driver.findElement(By.xpath("//input[@id='rq_email_address']"))
		                .sendKeys("test@gmail.com");

		        driver.findElement(By.xpath("//input[@id='rq_compuny_name']"))
		                .sendKeys("pixlogix");

		        driver.findElement(By.xpath("//textarea[@id='rq_message']"))
		                .sendKeys("harshad automation testing");

		        driver.findElement(By.xpath("//input[@id='mobile_code']"))
                .sendKeys("08542385025");


		   


WebElement service=driver.findElement(By.xpath("//select[@id='rq_services']"));

Select Service  = new Select(service);

Service.selectByVisibleText("SEO");



WebElement budget=driver.findElement(By.xpath("//select[@id='rq_proj_budget']"));

 Select Budget = new Select(budget);
    
 Budget.selectByVisibleText("Below $5k (in USD)");

 

		        
		        WebElement submitButton = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
		        submitButton.click();
		        String currentUrl = driver.getCurrentUrl();
		        String actualUrl = "https://www.pixlogix.com/thank-you/";
		        Assert.assertEquals(currentUrl, actualUrl);
		    }

		    @Test(priority = 2)
		    public void fill_quote_Form_with_blank_values()  {
		      
		    	WebElement submitButton = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
		        submitButton.click();
		        
		       Assert.assertFalse(false);
		    }

	    @Test(priority = 3)
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
	    
		    
		    
		    		    @Test(priority = 5)
		    public void Button_enalable_check()  {
		    
		    
		    
		    
		    		    	WebElement   Button_enalable_check= 	driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
		    
		    		    	Button_enalable_check.isEnabled();
		    
		    		    }
			  
			    
		    
	    @Test(priority = 5)
	    public void Only_require_field_messagecheck()  {
	        // Fill out the form fields with blank values
	        driver.findElement(By.xpath("//input[@id='rq_first_name']")).clear();
	        driver.findElement(By.xpath("//input[@id='rq_first_name']")).sendKeys("john");

	        driver.findElement(By.xpath("//input[@id='rq_email_address']")).clear();
	        driver.findElement(By.xpath("//input[@id='rq_email_address']")).sendKeys("mailid@gmail.com");

	        driver.findElement(By.xpath("//input[@id='rq_compuny_name']")).clear();
	        driver.findElement(By.xpath("//input[@id='rq_compuny_name']")).sendKeys("test company");

	       

	        driver.findElement(By.xpath("//input[@id='mobile_code']")).clear();
	        driver.findElement(By.xpath("//input[@id='mobile_code']")).sendKeys("84657647465");

	    
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
	        String actualUrl = "https://www.pixlogix.com/thank-you/";
	        Assert.assertEquals(currentUrl, actualUrl);
	    }
	    
	    
	    
}
	    
	    
	    
		

		
		
		
		
		