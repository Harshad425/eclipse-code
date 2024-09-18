package coursepracticeclass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alet {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// first 
			 
		/*	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
			
			Alert myalert=driver.switchTo().alert();
			System.out.println(myalert.getText());
			myalert.accept();
			*/
			
			// second
			
			//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
			
			
		//Thread.sleep(5000);
			
		//driver.switchTo().alert().accept();
		
	//	driver.switchTo().alert().dismiss();
		
		
		
		
		/*	Alert myalert2=driver.switchTo().alert();
			System.out.println(myalert2.getText());
			myalert2.accept();*/
			
			
			// third
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		
		
		
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
			
			
			
			
	}

}
