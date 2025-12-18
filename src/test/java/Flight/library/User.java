package Flight.library;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class User extends AppUtils 

{
	
	
public boolean addUser(String name,String email,String gender,String contact,String password,String dob)
{
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("name")).sendKeys(name);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.name("gender")).sendKeys(gender);
	driver.findElement(By.id("contact")).sendKeys(contact);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("dob")).sendKeys(dob);
	if(!driver.findElement(By.id("flexCheckChecked")).isSelected())
	{
		driver.findElement(By.id("flexCheckChecked")).click();
	}
	driver.findElement(By.xpath("//input[@value='Register']")).click();
	String actmsg = driver.findElement(By.xpath("//h4")).getText();
	if(actmsg.toLowerCase().contains("successfully registered"))
	{
		return true;
	}else
	{
		return false;
	}	
}


  
}	

//div[2]/div/div[1]/h4
	
	
	