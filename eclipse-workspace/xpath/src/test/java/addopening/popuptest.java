package addopening;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class popuptest {

	public static void main(String[] args) throws InterruptedException {
	
		
				
		 WebDriver driver = new ChromeDriver();
	        
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        // Navigate to login page
	        driver.get("http://hrmdev.pixlogixservice.com/login");
	        
	        // Perform login
	        
	        System.out.println("Perform login");
	        
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
	        
	        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
	        
	        System.out.println("Successful log in");
	        
	        // Wait for 5 seconds
	        Thread.sleep(5000);
	        
	        // Navigate to openings page
	        
	        System.out.println("Navigate to openings page");

	        driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
	        Thread.sleep(5000);
	        
	        // Click on the button to add new opening
	        
	        System.out.println("Click on the button to add new opening");
	        
	        driver.findElement(By.xpath("//a[@class='ms-auto ms-sm-0 btn btn-md btn-primary']")).click();
	        Thread.sleep(5000);
	        
	        // Fill the form fields
	        
	        System.out.println("Fill the form fields");
	        
	        WebElement field1 = driver.findElement(By.xpath("//form[@id='add-form']//input[@name='designation']"));
	        
	        field1.sendKeys("john");
	        
	        Thread.sleep(5000);
	        
	        WebElement field2 = driver.findElement(By.xpath("//form[@id='add-form']//input[@name='openings_count']"));
	        
	        field2.sendKeys("453");
				
				
				
				
				WebElement ascountry = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/span[1]/span[1]/span[1]"));
			       Select finalcountry = new Select(ascountry);
			        Thread.sleep(5000);
			        finalcountry.selectByVisibleText("Wordpress Development");
			        Thread.sleep(5000);
			        
			        WebElement priority = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[5]/span[1]/span[1]/span[1]"));
			        Select finalpri = new Select(priority);
			        Thread.sleep(5000);
			        finalpri.selectByVisibleText("High");
			        Thread.sleep(5000);
			        
			        WebElement exprience = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/span[1]/span[1]/span[1]"));
			        Select exp = new Select(exprience);
			        Thread.sleep(5000);
			        exp.selectByVisibleText("Fresher");
			        Thread.sleep(5000);*/
			        
	        System.out.println("Process for submit button");
			        
			        // Submit the form
			        driver.findElement(By.xpath("//input[@value='Submit']")).click();
			        
			        System.out.println("Sucessfully submit");
			        
			        // Quit the driver
			        driver.quit();
			        
			        
			        
			        
			        
			        
	}
	
}
