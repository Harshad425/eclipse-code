package day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class htmllocator {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		// name
		// driver.findElement(By.name("search")).sendKeys("mac");
		
		
		//id
		//boolean test=driver.findElement(By.id("log0")).isDisplayed();
		//System.out.println(test);
		
		// link adnd partail link
		
		//driver.findElement(By.linkText("Contact Us")).click();
		
		//List<WebElement>headerlinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println(headerlinks.size());
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		
		
		
	}

}
