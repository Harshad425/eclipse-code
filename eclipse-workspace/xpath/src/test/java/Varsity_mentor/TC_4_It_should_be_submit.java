package Varsity_mentor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  TC_4_It_should_be_submit { 

WebDriver driver;
	
	@BeforeMethod
	void setup() {
		
		
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("http://64.4.160.99/varsitymentor_dev/mentor-application/");


	}

	
	@Test()
	void Button_check_enable_or_not() throws InterruptedException {
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    Thread.sleep(5000);

 WebElement submitbutton = driver.findElement(By.xpath("//button[text()='Submit']"));




 submitbutton.isEnabled();
	}
}
	

