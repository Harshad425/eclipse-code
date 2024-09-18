package coursepracticeclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableconcept {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			// raw
			int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
			
			
			//System.out.println(rows);*/
			
			// column
			
			
			int column= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
			
	//		System.out.println(column);
			
			
			
//	String columnandraw=driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[2]")).getText();
		//	System.out.println(columnandraw);

				{
			
		String columnandraws=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		 System.out.println(columnandraws+"/t");
			
				}
				System.out.println();
			
	}

	}
}
