package openingsmodule;

package openingsmodule;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class Openingsmodule {

	public static void main(String[] args) {
	
				
							

					 WebDriver driver = new ChromeDriver();
					        
					   // Set implicit wait
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
					        
					      // Navigate to login page
					      driver.get("http://hrmdev.pixlogixservice.com/login");
					      
					      
					        // Perform login
					        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizymu@mailinator.com");
					        
					        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");
					        
					        driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
					        
					        System.out.println("Successful log in");
					        
					        driver.findElement(By.cssSelector("svg[xmlns='http://www.w3.org/2000/svg']")).click();
					        Thread.sleep(5000);
	}

}
