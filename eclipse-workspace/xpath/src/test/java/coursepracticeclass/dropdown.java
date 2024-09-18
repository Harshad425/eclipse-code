package coursepracticeclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		//driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			
		/*	
			WebElement dpcountry=driver.findElement(By.xpath("//select[@id='country']"));
			
			Select dpcountry3 =new Select(dpcountry);
			dpcountry3.selectByVisibleText("France");
			
			
			*/
			
			// auto suggest dropdown
			
			
				driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(5000);
			
			
			
	ChromeDriver driver=new ChromeDriver();

	driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(5000);
			
			
	}

}
