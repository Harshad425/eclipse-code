package Recruitmenttool;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginmodulein {

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

		Thread.sleep(10000);

		// -----------------------------------------------------------------------------------------
		// Test when user clicks only the login button in a new window
		System.out.println("Test case 2: Open new window and verify validation message");

		// Open a new window
		((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");

		// Switch to the new window
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));

		// Navigate to the login page in the new window
		driver.get("http://hrmdev.pixlogixservice.com/login");

		// Click the login button without entering any credentials
		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();

		// Check for validation message
		WebElement validationMessage = driver.findElement(By.xpath("//*[@id=\"swal2-html-container\"]"));

		if (validationMessage.isDisplayed()) {
			System.out.println("Validation message is displayed: " + validationMessage.getText());
		} else {
			System.out.println("Validation message is not displayed");
		}

		// Close the driver after some operations
		driver.quit();
	}
}
