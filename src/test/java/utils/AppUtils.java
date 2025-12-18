package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils 
	{

		public static WebDriver driver;
		public static String url = "http://flights.qedgetech.com";
		public static String screenshotSubFolderName;
		
		@BeforeSuite
		public static void launchApp()
		{
		
		     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
			
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(url);
			
		}
		@AfterSuite
		public static void closeApp()
		{
			driver.close();
		}
		
		public static void takeScreenShot(String filename) throws Exception
		{
		  if(screenshotSubFolderName == null)
			{
				LocalDateTime myDateObj = LocalDateTime.now();
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			    screenshotSubFolderName = myDateObj.format(myFormatObj);    
			}
		
			
			TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
			File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Screenshots/"+ screenshotSubFolderName+"/" +filename);
			//File destFile = new File("./Screenshots/" +filename);
			FileUtils.copyFile(sourceFile, destFile);
			System.out.println("Screenshot saved successfully");
	       
		}
	}


