package TestNg_practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {

	

    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }

   @Test(dataProvider="datatestdemo")
    public void fill_quote_Form_withvalid(String mail, String psw) throws InterruptedException {
	   driver.get("http://hrmdev.pixlogixservice.com/login");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys(mail);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(psw);
Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='kt_sign_in_submit']")).click();
		Thread.sleep(5000);
		String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "http://hrmdev.pixlogixservice.com/recruitment-tool/dashboard");
		
   }

   
   @AfterClass
   void teardown() {  
	   driver.quit();
	    
   }
   
    @DataProvider(name="datatestdemo")
    Object[][] logindata()
    {
    Object data [][] = {
    		
    		{"adgdfgd" , "fdsfaff"},
    		{"" , ""},
    		{"            " , "#Sagar@307"},
    		{"bidizyrretwtlinator.com" , ""},
    		{"bidizyrretwtlinator.com" , "sdgdgdag"},
    		{"cajir93715@bitofee.com" , "#testhr@123"},
    };
    return data;
    }
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    