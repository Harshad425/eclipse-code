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

public class TC_2_It_should_be_submit { 

	

WebDriver driver;
	
@BeforeMethod
void setup() {
	
 driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");

}

	@Test()
	void Fill_Positve_value_with_returning_radio_button_click() throws InterruptedException {
		

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Background Information

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

	WebElement mentorship_program = driver.findElement(By.xpath("//input[@value='To support my alma mater']"));
	mentorship_program.click();
	
	
	
	WebElement provide_more=driver.findElement(By.xpath("//input[@name='elaboration-answer']"));
	provide_more.sendKeys("thank you");
	
	
	WebElement add_list=driver.findElement(By.cssSelector("input[value='Yes'][name='list-on-website']"));
	add_list.click();
	
	
	WebElement returning_mentor=driver.findElement(By.cssSelector("input[value='Returning']"));
	returning_mentor.click();
	
	
	// For Returning Mentors

	
	
	WebElement workedd_well_program= driver.findElement(By.xpath("//input[@name='worked-well']"));
	workedd_well_program.sendKeys("program test");

		
	WebElement improved_program = driver.findElement(By.xpath("//input[@name='improvements']"));
	improved_program.sendKeys("testing data");

		
		
	WebElement mentee_last_year= driver.findElement(By.xpath("//input[@name='meetings-last-year']"));
	mentee_last_year.sendKeys("dummy");

		

	WebElement commitment= driver.findElement(By.xpath("//input[@value='Too much']"));
	commitment.click();
		
		
	WebElement activities= driver.findElement(By.xpath("//input[@value='Satisfied']"));
	activities.click();
		

	WebElement academic=driver.findElement(By.cssSelector("input[value='No'][name='continue-mentoring']"));
	academic.click();	
		
	WebElement training =driver.findElement(By.cssSelector("input[value='Maybe'][name='speak-at-seminars']"));
	training.click();

	WebElement recommend = driver.findElement(By.xpath("//input[@name='recommend-mentor']"));
	recommend.sendKeys("mark");


		
	WebElement suggestions = driver.findElement(By.xpath("//textarea[@name='mentor-introduction']"));
	suggestions.sendKeys("warne");

		

	Thread.sleep(5000);
	WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));
    submitbutton.click();
	
	}}
	
	
	
	
	
	