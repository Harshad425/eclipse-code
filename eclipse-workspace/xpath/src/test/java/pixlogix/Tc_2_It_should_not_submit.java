package pixlogix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_2_It_should_not_submit {

	
	

	
	WebDriver driver;
	@BeforeTest
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.pixlogix.com/careers/php-team-lead/");
	}
	
	
	@Test()
	void When_we_fill_with_blank_value__error_message_should_show()  {

		
	driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']")).sendKeys("");




	WebElement age=driver.findElement(By.xpath("//input[@placeholder='Enter Your Age']"));
	age.clear();
	age.sendKeys("");



	WebElement location=driver.findElement(By.xpath("//input[@placeholder='Enter Your Current Location']"));
	location.clear();
	location.sendKeys("");


	WebElement noticep=driver.findElement(By.xpath("//input[@placeholder='Notice Period']"));
	noticep.clear();
			noticep.sendKeys("");	
			
			
	WebElement number=driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']"));
	number.clear();
	number.sendKeys("");



	WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']"));
	email.clear();
	email.sendKeys("");



	WebElement linkdn=driver.findElement(By.xpath("//input[@placeholder='Enter Your Linkedin Profile URL']"));
	linkdn.clear();
	linkdn.sendKeys("");



	WebElement currentctc=driver.findElement(By.xpath("//input[@placeholder='Enter Your Current CTC']"));
	currentctc.clear();
	currentctc.sendKeys("");



	WebElement expectedctc=driver.findElement(By.xpath("//input[@placeholder='Enter Your Expected CTC']"));
	expectedctc.clear();
	expectedctc.sendKeys("");



	WebElement skil=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Skills']"));
	skil.clear();
	skil.sendKeys("");

	//WebElement remove=driver.findElement(By.xpath("//span[@class='dnd-icon-remove']"));
	//remove.click();

	WebElement personalattribute=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Personal Attribute']"));
	personalattribute.clear();
	personalattribute.sendKeys("");



	WebElement message=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Message To HR']"));
	message.clear();
	message.sendKeys("");





	WebElement applyNowButton = driver.findElement(By.xpath("//button[normalize-space()='Apply Now']"));

	applyNowButton.click();





	//WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='One or more fields have an error. Please check and try again.']")));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	// Alternatively, if you want to be more flexible with the text
	 WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'One or more fields have an error')]")));

	String actualMessage = errorMessageElement.getText();

	// Print the actual message for debugging
	System.out.println("Actual Message: " + actualMessage);

	// Expected error message
	String expectedMessage = "One or more fields have an error. Please check and try again.";

	// Assert the error message
	Assert.assertEquals(actualMessage, expectedMessage);


	}

		
		
	
	
	
	
	
	
	
	
	
	
	
	
}
