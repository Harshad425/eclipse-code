package addopening;


import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver
;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class automation {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		 WebDriver driver = new ChromeDriver();

	        // Set implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	        // Navigate to login page
	        driver.get("http://hrmdev.pixlogixservice.com/login");

	        // Perform login  - positive with both
	      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
	        
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
	        
	        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
	        
		      WebElement desktop=  driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		        Thread.sleep(5000);

		    		 
		        Actions  act= new Actions(driver);
		        Thread.sleep(5000);
		      act.dragAndDrop(driver.findElement(By.xpath("//a[@class='fw-bolder text-dark-75 text-gray-600 text-hover-primary fs-7 mb-1']")), null).perform();
		        Thread.sleep(5000);

		       /* // Perform login
		        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
		        
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
		        
		        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
		        
		        System.out.println("Successful log in");

		        // Wait for 5 seconds
		        Thread.sleep(5000);

		        // Navigate to openings page
		        driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
		        
		        Thread.sleep(5000);

		        // Click on the specific element
		        driver.findElement(By.xpath("(//*[name()='svg'])[11]")).click();
		        
		        Thread.sleep(5000);

		        // Click on the 'Close Opening' button
		        driver.findElement(By.xpath("//button[normalize-space()='Close Opening']")).click();
		        
		        Thread.sleep(5000);*/
		    }
		

	
		
				

			
							

		
		
		

}
