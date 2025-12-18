package Flight.testcases;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Flight.library.login;
import utils.AppUtils;


public class loginwithvalidInputs extends login

{
	@Parameters({"email","password"})
	@Test
	public void checkUser(String email,String password) throws Exception
	{
		login lg = new login();
		lg.loginPage(email, password);
		boolean res = lg.dashboarddiplayed();
		Assert.assertTrue(res,"Login Unsuccesfull");
		AppUtils.takeScreenShot("img1.png");
	}

}
