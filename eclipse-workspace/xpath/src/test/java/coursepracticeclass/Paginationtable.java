package coursepracticeclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationtable {

	public static void main(String[] args) {
		
		
		
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		for(p=1;p<4;p++)
		{
			if (p>1)
			
			{
	WebElement actp=driver.findElements(By.xpath("//ul[@class='pagination']//li");
	actp.click();
	}
		}
