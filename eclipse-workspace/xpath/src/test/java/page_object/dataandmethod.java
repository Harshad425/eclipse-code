package page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import o    rg.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dataandmethod {

	
	  private WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));hghhjg
	        driver.get("http://hrmdev.pixlogixservice.com/login");
	    	   driver.manage().window().maximize();
	    }
	        
	        @Test()
	        public void test() throws InterruptedException {
	        	
	        	
	        	Login lp= new Login(driver);
	        	
	        	
	        	
	        	lp.setsmail("cajir93715@bitofee.com");
	        	
	        	lp.setpsw("#testhr@123");
	        	Thread.sleep(2000);

	        	lp.setclicklogin();
	        	
	        	
	    		Thread.sleep(5000);
	    		String currentUrl = driver.getCurrentUrl();
	            Assert.assertEquals(currentUrl, "http://hrmdev.pixlogixservice.com/recruitment-tool/dashboard");
	    		
	       }
	        	
	        }
	    	 
	    	  
	
	
	

