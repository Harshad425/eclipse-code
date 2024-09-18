import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Recruitmenttooltestng {
 
	
	
	
	
	WebDriver driver;
	@Test(priority=1)
	void openapp() throws InterruptedException
	{
		  driver = new ChromeDriver();

	        // Set implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        // Navigate to login page
	        driver.get("http://hrmdev.pixlogixservice.com/login");

	      
		        
	}
	
	
	@Test(priority=2)
	void testlogo() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("http://hrmdev.pixlogixservice.com/login");

	boolean logocheck= driver.findElement(By.xpath("//img[@alt='Logo']")).isDisplayed();
	
			System.out.println("Logocheck is proper or not " + logocheck);

	}
	
	
	
	
	
	@Test(priority=3)
	void login() throws InterruptedException
	{
		Thread.sleep(5000);
		  // Perform login  - positive with both
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
	        
	        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
	        
	}
	
	
	
	
	
	
	
	
	
	
	
  
}
