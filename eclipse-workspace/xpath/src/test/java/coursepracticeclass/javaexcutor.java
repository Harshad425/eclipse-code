package coursepracticeclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaexcutor {

	public static void main(String[] args) {
	
		
		
		

		 WebDriver driver = new ChromeDriver();
		        
		  
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        
	
			driver.get("https://testautomationpractice.blogspot.com/");
			
		WebElement jstest=	driver.findElement(By.xpath("//input[@id='name']"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].setAttribute('value','john')",jstest);
			
			
			WebElement jstest2=	driver.findElement(By.xpath("//input[@id='male']"));
			
			
			js.executeScript("arguments[0].click()",jstest2);
			
			
			
			
			
			
	}

}
