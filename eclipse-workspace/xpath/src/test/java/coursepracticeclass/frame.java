package coursepracticeclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");
			driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(5000);
		/*	WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

			 driver.switchTo().frame(frame1);
			 Thread.sleep(5000);

			 driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");*/
			 
driver.switchTo().defaultContent();

WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

driver.switchTo().frame(frame2);

driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
			 
			 
	}

}
