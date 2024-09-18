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

public class Groupingtest_testng_c {

	
	

	
	WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.pixlogix.com/get-a-quote/");
    }
	  
    @Test(priority = 5,groups= {"zx"})
public void Button_enalable_check()  {




    	WebElement   Button_enalable_check=driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));

    	Button_enalable_check.isEnabled();

    }



@Test(priority = 6,groups= {"xv"})
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
	
	
	
	
	
	
	
	
