package TestNg_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependancy {
	
WebDriver driver;
	
	@BeforeClass
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
	  
	      driver.get("http://hrmdev.pixlogixservice.com/login");
	      
	      
	  }
	      @Test(priority=1)        //dependsOnMethods= {"setup"}
	      void login() {
	
	      
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidifdsafsdazymu@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
	        
	
	        Assert.fail();
	    
	        
	      }
	      @Test(priority=2,dependsOnMethods= {"login"})
	      void edit() throws InterruptedException {
	       Thread.sleep(5000);

	        
	        driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
	 
	        
	        System.out.println("click on edit ");
	        driver.findElement(By.xpath("(//*[name()='svg'])[12]")).click();
	   

	WebElement   close =   driver.findElement(By.xpath("//button[normalize-space()='Close Opening']"));
	close.click();
	       // fill the editing field 
	       
	        System.out.println("fill the editing field ");
	        
	driver.findElement(By.xpath("//form[@id='edit-form']//input[@name='designation']")).sendKeys("watson");
	
	driver.findElement(By.xpath("(//input[@value='Update'])[1]")).click();
	
	System.out.println("Sucessfully edited ");
	
}
	      
	      @AfterClass
	      void teardown() {
	      driver.quit();
}

}
