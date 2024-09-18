package pixlogix;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_15_it_should_not_submit{

	WebDriver driver;
	
	@BeforeTest
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.pixlogix.com/careers/php-team-lead/");
	}
	
	
	
	@Test()
	void Fill_required_field_with_qualification_blank()  {
	
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

		driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']")).sendKeys("Watson");

		
	
		WebElement age=driver.findElement(By.xpath("//input[@placeholder='Enter Your Age']"));
		age.sendKeys("25");
		
		
		WebElement location=driver.findElement(By.xpath("//input[@placeholder='Enter Your Current Location']"));
		location.sendKeys("parth");
		
		
		WebElement noticep=driver.findElement(By.xpath("//input[@placeholder='Notice Period']"));
				noticep.sendKeys("parth");	
				
				
		WebElement number=driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']"));
		number.sendKeys("12345236745");
		
		
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']"));
		email.sendKeys("Test@gmail.com");
		
		
	
		WebElement uploadresume=driver.findElement(By.cssSelector(".wpcf7-drag-n-drop-file"));
		
		//uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Documents\\javaif nested conditon.txt");
		
		
//		uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Innerpage.jpg");
		uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Who We Are.docx");
		
		
		
		
		
		
		WebElement linkdn=driver.findElement(By.xpath("//input[@placeholder='Enter Your Linkedin Profile URL']"));
		linkdn.sendKeys("linkdynid.com");
		
		
		

		WebElement expectedctc=driver.findElement(By.xpath("//input[@placeholder='Enter Your Expected CTC']"));
		expectedctc.sendKeys("40k");
		
		
		
		WebElement currentctc=driver.findElement(By.xpath("//input[@placeholder='Enter Your Current CTC']"));
		currentctc.sendKeys("30k");
		
		
	
		
		
		WebElement gender=driver.findElement(By.xpath("//select[@name='gender']"));
		
		 Select Gender = new Select(gender);
	        
		 Gender.selectByVisibleText("Male");
		
		 
		
		WebElement exprience=driver.findElement(By.xpath("//select[@name='experience']"));
		
		Select Exprience = new Select(exprience);
        
		Exprience.selectByVisibleText("Fresher");
		
	
		
		
		WebElement skil=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Skills']"));
		skil.sendKeys("Lorem ipsume test");
		
		
		
		
		WebElement personalattribute=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Personal Attribute']"));
		personalattribute.sendKeys("Dummy content for a test");
		
		
		
		WebElement message=driver.findElement(By.xpath("//textarea[@placeholder='Enter Your Message To HR']"));
		message.sendKeys("This is for a automation testing");
		



/*JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement name = driver.findElement(By.xpath("//button[@data-text='Apply Now']"));
js.executeScript("arguments[0].scrollIntoView(true);", name);
name.click();*/


	

		 WebElement applyNowButton = driver.findElement(By.xpath("//button[@data-text='Apply Now']\r\n"
		 		+ ""));
		 applyNowButton.click();
		 	

	
	
	 }
}
	



