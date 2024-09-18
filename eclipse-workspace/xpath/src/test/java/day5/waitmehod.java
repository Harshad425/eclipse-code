package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Recruitmenttool.List;

public class waitmehod {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		// explixity method use  3
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); // declaration 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		
		username.sendKeys("admin");
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("driver.findElement(By.xpath(\"//input[@placeholder='Password']")));
			
		password.sendKeys("admin123");
		
		
	//	WebElement loginbutton=mywait.until(ExpectedConditions.elementToBeClickable("driver.findElement(By.xpath(\"//button[@type='submit']")));
	//	loginbutton.click();
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

		
		
		
		
		// implicitywait mehod use 2
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

		
		
		
		// firsr sleep method use 1
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

		
	set<String> windowid=new driver.getWindowHandles();
		com.sun.tools.javac.util.List<String> windowList=new Arraylist();
		
		
		String pid= windowList.get(0);
		String	cid=windowList.get(1);
		/// switch child 
		driver.switchTo().window(cid);
		System.out.println(driver.getTitle());
		
		
		/// switch parent
		driver.switchTo().window(pid);
		System.out.println(driver.getTitle());
		
		
		
	}

}
