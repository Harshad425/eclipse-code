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

public class TC_23_It_should_be_submit { 

	
	
	
	
WebDriver driver;
	
	@BeforeMethod
	void setup() {
		
		
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");


	}

	
	@Test()
	void Returning_page_showing_or_not_after_click_on_it() {	
		
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement returning_mentor=driver.findElement(By.cssSelector("input[value='Returning']"));
		returning_mentor.click();
  
		  /*JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebElement returning_mentor = driver.findElement(By.xpath("//input[contains(@value, 'Returning')]"));
		    js.executeScript("arguments[0].scrollIntoView(true);", returning_mentor);
		    returning_mentor.click();*/

		//WebElement returning_mentor=driver.findElement(By.xpath("//input[@value='Too much']"));
		//returning_mentor.click();
		
		
   WebElement nextvalue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name, 'meetings-last-year')]")));

}
}