package Flight.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Flight.library.User;
//import flight.library.User;
import utils.AppUtils;

public class UserRegistrationsuccess extends User
{

	@Parameters({"name","email","gender","contact","password","dob"})
	@Test
	
	public void checkUserRegistation(String name,String email,String gender,String contact,String password,String dob)
	
	{
		
		Flight.library.User us = new Flight.library.User();
		boolean res = us.addUser(name, email, gender, contact, password, dob);
		Assert.assertTrue(res, "User Registration UnSuccessful");
		
		
		
	}
		
		
		
	}
	


