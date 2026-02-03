package basegeneric;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	@BeforeMethod()
	public void openApp()
	{
		WebDriverManager.initDriver();
		WebDriverManager.getDriver().manage().window().maximize();		
		WebDriverManager.getDriver().get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	@AfterMethod()
	public void closeApp()
	{
		WebDriverManager.quitDriver();
	}
}
