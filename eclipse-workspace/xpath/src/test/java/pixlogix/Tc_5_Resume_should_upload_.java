package pixlogix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc_5_Resume_should_upload_ {

	
	
WebDriver driver;
	
	@BeforeTest
	void setup() {
		
	
     driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://www.pixlogix.com/careers/php-team-lead/");
	}
	
	
	
	@Test()
	void Resume_file_is_updating ()  {
	
	
		
		
	WebElement uploadresume=driver.findElement(By.cssSelector(".wpcf7-drag-n-drop-file"));
	
	//uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Documents\\javaif nested conditon.txt");
	
	
//	uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Innerpage.jpg");
	uploadresume.sendKeys("C:\\Users\\Fortune Systems\\Downloads\\Who We Are.docx");
	
	
	WebElement remove=driver.findElement(By.cssSelector(".dnd-icon-remove"));
	remove.click();
	
	}	
	
	
}
