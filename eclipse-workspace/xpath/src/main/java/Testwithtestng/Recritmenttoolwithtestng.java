package Testwithtestng;

import org.testng.annotations.Test;

public class Recritmenttoolwithtestng {

	
	
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("openapp");	
	}
	
	
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login");
	}
	
	
	
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout");
	}
	
	
	
	
	
	
	
	
}
