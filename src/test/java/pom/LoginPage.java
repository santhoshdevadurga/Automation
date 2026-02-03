package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basegeneric.WebDriverManager;
import interfaces.IPage;
import utils.Waitutils;

public class LoginPage implements IPage{

	public LoginPage()
	{
		PageFactory.initElements(WebDriverManager.getDriver(),this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="submit")
	private WebElement login;
	
	public HomePage login(String username,String password)
	{
		Waitutils.waitandclick(user);
		user.sendKeys(username);
		pwd.sendKeys(password);
		login.click();
		return new HomePage();
	}

	@Override
	public boolean isPageloaded() {
		// TODO Auto-generated method stub
		return user.isDisplayed();
	}
	

}

