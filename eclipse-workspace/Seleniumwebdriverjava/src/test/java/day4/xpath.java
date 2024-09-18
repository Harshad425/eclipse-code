package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
	
		
		
		 WebDriver driver=new ChromeDriver();
			
			driver.get("http://hrmdev.pixlogixservice.com/recruitment-tool/openings");
			
			driver.manage().window().maximize();
			
	//	driver.findElement(By.xpath("//input[@placeholder='Search'][@name='Search']")).click();
		
		
		
	}

}
