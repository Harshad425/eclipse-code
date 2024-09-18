package day5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Propagator.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class javamethods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
			driver.manage().window().maximize();
		
		// isdisplayed method
			
		// WebElement logo =	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println(logo.isDisplayed());
 //boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
 //System.out.println(logo);
			
			//isenable method
			
		//boolean	placeholder=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		//System.out.println(placeholder);
			
			//isssected method
			
	WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
			
			System.out.println("before selection");
			System.out.println("afterselection"+male.isSelected());
			System.out.println("afterselection"+female.isSelected());
			male.click();
			System.out.println("before selection of male");
			System.out.println("afterselection"+male.isSelected());
			System.out.println(female.isSelected());
			
		female.click();
			System.out.println("before selection of female");
			System.out.println("afterselection"+male.isSelected());
			System.out.println("afterselection"+female.isSelected());
			
	
		boolean check=	driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println(check );
		
	}
	

}
