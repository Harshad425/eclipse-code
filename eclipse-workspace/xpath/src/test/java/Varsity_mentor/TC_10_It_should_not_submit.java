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

public class TC_10_It_should_not_submit { 

	WebDriver driver;
	
	@BeforeMethod
	void setup() {
		
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");
	
	
	


	}

	
	@Test()
	void Fill_number_with_blank_value() throws InterruptedException {

		
		
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[name='first-name']")).sendKeys("first name"); 
		
	
	WebElement Last_name =driver.findElement(By.xpath("//input[@name='last-name']"));
	Last_name.sendKeys("test");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='email-address']"));
	email.sendKeys("Test@gmail.com");

	
	
	
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
	
	
	
	WebElement provide_more=driver.findElement(By.xpath("//input[@name='elaboration-answer']"));
	provide_more.sendKeys("thank you");
	
	
	WebElement add_list=driver.findElement(By.cssSelector("input[value='Yes'][name='list-on-website']"));
	add_list.click();
	
	
	
	WebElement returning_mentor=driver.findElement(By.xpath("//input[@type='radio' and @name='new-or-returning-mentor' and @value='New']"));
	returning_mentor.click();
	
	

	
	
	WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
    submitbutton.click();
	}}