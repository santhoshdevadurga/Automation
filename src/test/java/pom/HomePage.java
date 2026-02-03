package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basegeneric.WebDriverManager;
import interfaces.IPage;
import utils.Waitutils;

public class HomePage implements IPage{

	HomePage()
	{
		PageFactory.initElements(WebDriverManager.getDriver(),this);
	}
	
	@FindBy(xpath="//h1")
	private WebElement title;
	
	public String welcometext()
	{
	    return title.getText();
	}
	


	@Override
	public boolean isPageloaded() {
		// TODO Auto-generated method stub
		return title.isDisplayed();
	}
}
