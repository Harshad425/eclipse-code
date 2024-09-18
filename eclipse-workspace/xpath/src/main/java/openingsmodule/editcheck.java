package openingsmodule;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class editcheck {
	
	

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
			        
			      
			       /* Thread.sleep(5000);
			        
			        // openings page 
			        
			        System.out.println("Navigate to the openings page");
			        
			        driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
			        
			        // click on edit 
			        
			        System.out.println("click on edit ");
			        driver.findElement(By.xpath("(//*[name()='svg'])[12]")).click();
			        Thread.sleep(5000);

		/*	WebElement   close =   driver.findElement(By.xpath("//button[normalize-space()='Close Opening']"));
			close.click();*/
			       // fill the editing field 
			        
			        System.out.println("fill the editing field ");
			        
			driver.findElement(By.xpath("//form[@id='edit-form']//input[@name='designation']")).sendKeys("watson");
			
			driver.findElement(By.xpath("(//input[@value='Update'])[1]")).click();
			
			System.out.println("Sucessfully edited ");
			
	}
}

