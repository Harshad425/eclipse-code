package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	
	WebDriver driver;
	
	// constuctor
	
	Login(WebDriver driver)
	{
		this.driver=driver
				
	
	By	button_submit=By.xpath("//button[@id='kt_sign_in_submit']");
	
	
	// action method
	
	
	public void setsmail(String mail) {
	driver.findElement(email_location).sendKeys(mail);
	}
	
	
	public void setpsw(String psw) {
	driver.findElement(psd_locaton).sendKeys(psw);
	}
	
	
	public void setclicklogin() {
	driver.findElement(button_submit).click();
	}