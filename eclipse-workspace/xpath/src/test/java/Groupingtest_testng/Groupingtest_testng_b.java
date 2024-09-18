package Groupingtest_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingtest_testng_b {

	WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.pixlogix.com/get-a-quote/");
    }
	
    @Test(priority = 1,groups= {"ab"})
    public void fill_quote_Form_withvalid() throws 
    
    

		        // Fill ou                                                                               t the form fields
		        driver.findElem                                                                                                                 ent(By.xpath("//                                                                                                                                                                          542385025")
                                                                                                                   ment(By.xpath("//select[@id='rq_submitButton = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));blic void fill_quote_For                                                                                                                                       m_with_blank_values()  {
	      

	
	
	
	
	
	
	
	
	
	  }
	
	
	
	
}
