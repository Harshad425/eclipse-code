package pixlogix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_3_logo_should_be_visible {

	
	
	WebDriver driver;


	@BeforeTest
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.pixlogix.com/careers/php-team-lead/");
	}
	
	
	
	@Test()
	void Pixlogix_logo_should_show_properly()  {
	
	
	
	WebElement Logo=driver.findElement(By.cssSelector("img[alt='logo-header']"));
	Logo.isDisplayed();
	
	
	}	
	
}
