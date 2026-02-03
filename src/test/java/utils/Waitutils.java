package utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basegeneric.WebDriverManager;

public class Waitutils {
	
	public static WebDriverWait getwait() {
	    return new WebDriverWait(WebDriverManager.getDriver(), Duration.ofSeconds(10));
	}

    
	public static void waitforvisible(WebElement element)
	{
		getwait().until(ExpectedConditions.visibilityOf(element));
	}

	
	public static void waitandclick(WebElement element)
	{
		waitforvisible(element);
		element.click();
	}
}
