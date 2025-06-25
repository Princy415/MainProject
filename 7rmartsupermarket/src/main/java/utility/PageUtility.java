package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	public void selectbyvalue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public void selectbyvisibletext(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void selectbyindex(WebElement element,int value)
	{
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	}
