package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Seleniumintro {

	public static void main(String[] args) {
		// launch browser 
		
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		// open url
		
		driver.get("https://demo.opencart.com/");
		
		
		// validate title shoud be = Your store
		
		String website_title = driver.getTitle();
		
		if(website_title.equals("Your Store"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case fail");
		}
		
		// close browse
		
		driver.close();
		//driver.quit();
		
		
		}
		
	}


