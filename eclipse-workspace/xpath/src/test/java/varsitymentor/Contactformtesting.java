package varsitymentor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Contactformtesting {
	
	


	WebDriver driver;
	
	@Test(priority = 1)
	void setup() {
		
		
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");
	
	


	}

	
	@Test(priority = 2)
	void Posive_case_with_new() {

		// Background Information
		
	WebElement First_Name=driver.findElement(By.xpath("//input[@name='first-name']"));
	First_Name.sendKeys("john");
	
	
	
	WebElement Last_name =driver.findElement(By.xpath("//input[@name='last-name']"));
	Last_name.sendKeys("test");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='email-address']"));
	email.sendKeys("Test@gmail.com");
	
			
			
	WebElement number=driver.findElement(By.xpath("//input[@name='mobile-phone']"));
	number.sendKeys("12345236745");
	
	
	
	WebElement female=driver.findElement(By.xpath("//input[@value='Female']"));
	female.click();
	

	
	
	
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
	
	
	WebElement returning_mentor=driver.findElement(By.cssSelector("input[value='New']"));
	returning_mentor.click();
	
	

	
	
	WebElement submit=	driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
	submit.click();
	
	

	//Use explicit wait to ensure the success message is visible
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
    //WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Thank you for your message. It has been sent.']")));
    
    // Alternatively, if you want to be more flexible with the text
     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form sent'] div[class='wpcf7-response-output']")));
    String actualMessage = successMessageElement.getText();

    // Print the actual message for debugging
    System.out.println("Actual Message: " + actualMessage);

    // Expected success message
    String expectedMessage = "Thank you for your interest in becoming a VarsityMentor mentor. The information you provide in this application will help us match you with a student and will be kept confidential.";
    	

    // Assert the success message
    Assert.assertEquals(actualMessage, expectedMessage);
	
	}

	@Test(priority = 3)
	void Positive_case_with_recruting()  {
    
	
	
		WebElement First_Name=driver.findElement(By.xpath("//input[@name='first-name']"));
		First_Name.sendKeys("john");
		
		
		
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

			

		
		
		WebElement submit=	driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
		submit.click();
		
		First_Name.clear();
	    Last_name.clear();
	    email.clear();
	    number.clear();
	    role_and_current_company.clear();
	    industry_sector_work.clear();
	    provide_more.clear();
	    workedd_well_program.clear();
	    improved_program.clear();
	    mentee_last_year.clear();
	    recommend.clear();
	    suggestions.clear();
		

	/*	//Use explicit wait to ensure the success message is visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
	    //WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Thank you for your message. It has been sent.']")));
	    
	    // Alternatively, if you want to be more flexible with the text
	     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form sent'] div[class='wpcf7-response-output']")));
	    String actualMessage = successMessageElement.getText();

	    // Print the actual message for debugging
	    System.out.println("Actual Message: " + actualMessage);

	    // Expected success message
	    String expectedMessage = "Thank you for your interest in becoming a VarsityMentor mentor. The information you provide in this application will help us match you with a student and will be kept confidential.";
	    	

	    // Assert the success message
	    Assert.assertEquals(actualMessage, expectedMessage);*/
	}
	
	
	@Test(priority = 4)
	void blank_value() {
	  

	  
		
		
	    
	    WebElement submit = driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
	    submit.click();

	  
	     

		//Use explicit wait to ensure the success message is visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
	    //We("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
	    
	    
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
	
	@Test(priority = 5)
	void ivalid_mailid() {

		// Background Information
		
	WebElement First_Name=driver.findElement(By.xpath("//input[@name='first-name']"));
	First_Name.sendKeys("john");
	
	
	
	WebElement Last_name =driver.findElement(By.xpath("//input[@name='last-name']"));
	Last_name.sendKeys("test");
	
	WebElement email=driver.findElement(By.xpath("//input[@name='email-address']"));
	email.clear();
	email.sendKeys("Tcbvcbfdfom");
	
			
			
	WebElement number=driver.findElement(By.xpath("//input[@name='mobile-phone']"));
	number.sendKeys("12345236745");
	
	
	
	WebElement female=driver.findElement(By.xpath("//input[@value='Female']"));
	female.click();
	

	
	
	
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
	
	
	WebElement returning_mentor=driver.findElement(By.cssSelector("input[value='New']"));
	returning_mentor.click();
	
	

	
	
	WebElement submit=	driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
	submit.click();
	
	

	//Use explicit wait to ensure the success message is visible
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
    //We("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
    
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
	
	
	@Test(priority = 6)
	void Nagative_error_messages() {

		
		// Background Information
		
	WebElement First_Name=driver.findElement(By.xpath("//input[@name='first-name']"));
	First_Name.sendKeys("john");
	
	
	
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
	
	
	
	WebElement provide_more=driver.findElement(By.xpath("//input[@name='elaboration-answer']"));
	provide_more.sendKeys("thank you");
	
	
	WebElement add_list=driver.findElement(By.cssSelector("input[value='Yes'][name='list-on-website']"));
	add_list.click();
	
	
	WebElement returning_mentor=driver.findElement(By.cssSelector("input[value='New']"));
	returning_mentor.click();
	

	
	WebElement submit=	driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
	submit.click();
	
	

	//Use explicit wait to ensure the success message is visible
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
    //WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Thank you for your message. It has been sent.']")));
    
    // Alternatively, if you want to be more flexible with the text
     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form sent'] div[class='wpcf7-response-output']")));
    String actualMessage = successMessageElement.getText();

    // Print the actual message for debugging
    System.out.println("Actual Message: " + actualMessage);

    // Expected success message
    String expectedMessage = "Thank you for your interest in becoming a VarsityMentor mentor. The information you provide in this application will help us match you with a student and will be kept confidential.";
    	

    // Assert the success message
    Assert.assertNotEquals(actualMessage, expectedMessage);
	

	
	}
	
	@Test(priority = 7)
	void error_messages_invalid() {
	   
	    

	    WebElement submit = driver.findElement(By.cssSelector("button[class='theme-btn mt-30 bg-theme overflow-hidden d-inline-block text-white position-relative rounded font-weight-bold has-spinner']"));
	    submit.click();

	  
	    

		//Use explicit wait to ensure the success message is visible
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(38));
	    //We("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
	    
	    // Alternatively, if you want to be more flexible with the text
	     WebElement successMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form[class='wpcf7-form invalid'] div[class='wpcf7-response-output']")));
	    String actualMessage = successMessageElement.getText();

	    // Print the actual message for debugging
	    System.out.println("Actual Message: " + actualMessage);

	    // Expected success message
	    String expectedMessage = "One or more fields have an error. Please check and try again.";
	    	

	    // Assert the success message
	    Assert.assertNotEquals(actualMessage, expectedMessage);
	}

}   
	    
	    
	    
	    
	    
	
	
	
	
	

	


	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
