package day4;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class relativepath {

	public static void main(String[] args) {

	
			
			// absolute xpath
			// relative xpath
			
			
			// absoute path 
			
			// html/body/div/div/div2/a/image/
			
			
			
		 ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://demo.opencart.com//");
				
				driver.manage().window().maximize();
				
				// xpath with single 
				
		//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("TShirts");
			
			// xpath with multiple
			
			// input 
			
			
			// //input[@placeholder='Search] [@name='Search']
			
			//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='Search']")).sendKeys("TShirts");
			
			
		// xpath with or and and 
				
		// 		driver.findElement(By.xpath("//input[@placeholder='Search'] and / or [@name='Search']")).sendKeys("TShirts");
		

			// xpath with inner text link
				
				// a[text()='Desktop']
				
			//	driver.findElement(By.xpath("//*text()=['Cameras']")).click();
				
			//boolean	d= driver.findElement(By.xpath("//h3text()=['Featured']")).isDisplayed();		
				//System.out.println(d);
				
				// x path with contain 
				
				// driver.findElement(By.xpath("//input[contains(@placeholder ,'Sea')]")).sendKeys("TShirts");
				
				// x path start with
				
		
				//	driver.findElement(By.xpath("//input[starts-with(@placeholder ,'Sea')]")).sendKeys("TShirts");	
	
	// handing dynmic atribute
				
			// ex of - start and stop is id here
				 
	// input[@id='start' or @id='stop']
	
	//*[contains(@name, ' st')]
				//*[starts-with(@name, ' st')]
	
	// chianed path 
	
	// div[@id='logo']/a/img
	
	boolean	valueofnewpath= driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();		
	System.out.println(valueofnewpath);
	
	
	}
}
