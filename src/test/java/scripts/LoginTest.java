package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import basegeneric.BaseTest;
import pom.HomePage;
import pom.LoginPage;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void validateLogin()
	{
		LoginPage lp=new LoginPage();
		Assert.assertTrue(lp.isPageloaded(),"page notloaded");
		HomePage hp=lp.login("student", "Password123");
		Assert.assertTrue(hp.isPageloaded(),"page notloaded");
		Assert.assertTrue(hp.welcometext().contains("Logged"));
		
		
	}
	
	

}
