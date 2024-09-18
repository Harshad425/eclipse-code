package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {

	public static void main(String[] args) {
		
    WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		
			
		 
		 // tag id
		 
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		
		// tag class
		
		 //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		// tag atribute 
		driver.findElement(By.cssSelector("[placeholder='search stote']")).sendKeys("T-shirts");
		
		 // tag class atribute  q//input[@id='small-searchterms'] document.querySelector("#small-searchterms")
		// driver.findElement(By.cssSelector(".search-box-text[name='q')").sendKeys("T-shirts");
	}

}
