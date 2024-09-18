package coursepracticeclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			
			// only one
			//driver.findElement(By.xpath("//input[@id='sunday']")).click();
			
			
			
			// all select
			
	
 		
			List<WebElement> allc=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
			
			/*for (int i=0;i<allc.size();i++)
			{
				allc.get(i).click();
			}
			*/
			
		/*	for(WebElement checkboxes:allc)
			{
				checkboxes.click();
				
			}
			*/
			
			// last 3 select
			
			/*for(int i=4;i<allc.size();i++)
			{
				allc.get(i).click();
			}*/
			
			
			
		/*	for(WebElement checkb : allc )
			{
				checkb.click();
			}*/
			
			
			// first 3
			
		/*	for(int i=0;i<3;i++)
			{
				allc.get(i).click();
			}*/
			
			// select the unselect
			
			
			
			/*for(int i=0;i<3;i++)
			{
				allc.get(i).click();
			}*/
			
			
			
			// when all unselect with three select
			
			for(int i=0;i<allc.size();i++)
			{
				if(allc.get(i).isSelected())
		
			{
				allc.get(i).click();
			}
			
			
			
			
			}
			
			
			
			
			
			
			
	}

}
