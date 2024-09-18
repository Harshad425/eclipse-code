package pixlogix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_10_dropdown_value_should_be_select {

	
WebDriver driver;
	
	@BeforeTest
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.pixlogix.com/careers/php-team-lead/");
	}
	
	
	
	@Test()
	void When_we_click_on_dropdown_it_Value_shoud_select()  {
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Your Full Name']")).sendKeys("Watson");
		
		
		

	WebElement qualification=driver.findElement(By.xpath("//select[@name='qualification-menu']"));
	
	Select select  = new Select(qualification);
    
	select.selectByVisibleText("B.A");
	}
}