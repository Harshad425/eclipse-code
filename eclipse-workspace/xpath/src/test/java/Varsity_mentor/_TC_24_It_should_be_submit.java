package Varsity_mentor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _TC_24_It_should_be_submit { 

WebDriver driver;
	
	@BeforeMethod
	void setup() {
		
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");

	}

	
	@Test()
	void Fill_with_only_required_field() throws InterruptedException {

		// Background Information
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));

Thread.sleep(5000);
	   
WebElement name =driver.findElement(By.xpath("//input[@name='first-name']"));
name.sendKeys("first name"); 
	
	WebElement Last_name =driver.findElement(By.xpath("//input[@name='last-name']"));
	Last_name.sendKeys("test");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='email-address']"));
	email.sendKeys("Test@gmail.com");
	
			
			
	WebElement number=driver.findElement(By.xpath("//input[@name='mobile-phone']"));
	number.sendKeys("12345236745");
	
	
	
	WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
	male.click();
	

	
	
	
	// Education and Career History
	
	WebElement role_and_current_company = driver.findElement(By.xpath("//input[@name='profession-role-company']"));
	role_and_current_company.sendKeys("lorem");
	
	WebElement  industry_sector_work = driver.findElement(By.xpath("//input[@name='industry-sector']"));
	industry_sector_work.sendKeys("dummy");
	
	
	
	WebElement professional_experience= driver.findElement(By.xpath("//input[@value='3-4 years']"));
	professional_experience.click();
	
	
	WebElement mentorship_program = driver.findElement(By.xpath("//input[@value='To give back to the community']"));
	mentorship_program.click();

	
	WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
    submitbutton.click();



}

}    

