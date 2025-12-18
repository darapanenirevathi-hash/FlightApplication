package Flight.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class login extends AppUtils
{
	
	public void loginPage(String email, String password) 
	
	{
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	
	public boolean dashboarddiplayed()
	{
		String msg =driver.findElement(By.xpath("//div[1]/h2")).getText();
		if(msg.contains("User Dashboard"))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	

}
