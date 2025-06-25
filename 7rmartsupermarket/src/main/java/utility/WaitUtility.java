package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
	public void elementtobeclick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration .ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public void elementtobeselected(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
public void elementselectionstate(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementSelectionStateToBe(element, false));
}
public void elementselectionstatetobe(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementSelectionStateToBe(element, true));
}
public void elementtobeselected()
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
}
}




