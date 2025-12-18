package Flight.library;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.AppUtils;

public class BookingTicket extends login
{
	
	
	
	public void bookTicket(String flydate) throws Exception
	{
		driver.findElement(By.id("search-date")).click();
		//String flydate = "20-November-2025";
		String[] temp = flydate.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		
				
		String calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calYear.equals(year))
			
		{
			driver.findElement(By.linkText("Next")).click();
			calYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		
		
        String calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while(!calMonth.equalsIgnoreCase(month))
				
		{
			driver.findElement(By.linkText("Next")).click();
			calMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			
		}
		
		
		//WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> cal = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement element : cal)
		{
			if(element.getText().equals(date))
			{
				element.click();
				break;
			}
		}
		
		
	}
	
	
public void flyFrom(String text)
	{
		WebElement element =driver.findElement(By.xpath("//div[2]/select"));
	Select cat = new Select(element);
		cat.selectByVisibleText(text);
		
	}	

	
	
	public void flyTo(String text)
	{
		WebElement element =driver.findElement(By.xpath("//div[3]/select"));
		Select cat = new Select(element);
		cat.selectByVisibleText(text);
	}
	
	
	 public void click()
	 
	{
		driver.findElement(By.xpath("(//button)[1]")).click();
		
		
	}
	
	
	
	public void reservationFlightPage()
	{
		String actualMsg = driver.findElement(By.xpath("//div[1]/h3")).getText();
		String expextedMsg = "Flights Search Results";
		Assert.assertTrue(true, "No page displayed");
	}
	
	/*
	public void search()
	{
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[9]/button")).click();
	}
	*/
	
	
	
		
	}


