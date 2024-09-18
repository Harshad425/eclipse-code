package Recritmenttool;

import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginmodule {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Navigate to login page
		driver.get("http://hrmdev.pixlogixservice.com/login");

		// Test case 1: Successful login

		System.out.println("Test case 1: Successful login starting");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizyrretwtlinator.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("Successful login");
		
		
		
		
		

		/* driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
		
		Thread.sleep(2000);
		
		// Test case 2: Login with incorrect credentials
		
		driver.get("http://hrmdev.pixlogixservice.com/login");

		System.out.println("Test case 2: Login with incorrect credentials");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jogn123@gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123afasd");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("login failed ");

		driver.findElement(By.xpath("//input[@id='email']")).clear();

		driver.findElement(By.xpath("//input[@id='password']")).clear();

		Thread.sleep(2000);

		// Test case 3: Login with empty field
		
		driver.get("http://hrmdev.pixlogixservice.com/login");

		System.out.println("Test case 3: Login with empty field ");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" ");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("log in failed ");

		System.out.println("We can show any error message ");

		driver.findElement(By.xpath("//input[@id='email']")).clear();

		driver.findElement(By.xpath("//input[@id='password']")).clear();

		Thread.sleep(2000);

		// Test case 4: Login with Valid username and invalid password
		
		driver.get("http://hrmdev.pixlogixservice.com/login");

		System.out.println("Test case 4: Login with Valid username and invalid password");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizyrretwtlinator.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("4534bfdg@3");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("log in failed");

		Thread.sleep(2000);

		// Test case 5: Login with Valid password and invalid username

		driver.get("http://hrmdev.pixlogixservice.com/login");
		
		System.out.println("Test case 5: Login with Valid password and invalid username");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@1243gmail.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("log in failed");

		Thread.sleep(2000);

		// Test case 6: Login Login with empty username

		driver.get("http://hrmdev.pixlogixservice.com/login");
		
		System.out.println("Test case 6: Login Login with empty username");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("#Sagar@307");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("log in failed");

		// Test case 7: Login with empty password
		
		driver.get("http://hrmdev.pixlogixservice.com/login");

		System.out.println("Test case 7: Login with empty password");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bidizyrretwtlinator.com");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");

		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		System.out.println("log in failed");*/

	}
}
