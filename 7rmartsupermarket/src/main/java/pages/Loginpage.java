package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
public WebDriver driver;
public Loginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@placeholder='Username']")WebElement username;
@FindBy(xpath="//input[@placeholder='Password']")WebElement password;
@FindBy(xpath="//button[@type='submit']")WebElement signin;
@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;

public Loginpage  addUserNamePassword(String usernamefield,String passwordfield)
{
	username.sendKeys(usernamefield);
    password.sendKeys(passwordfield);
	return this;
}
public Homepage ClickOnSignin()
{
	signin.click();
	return new Homepage(driver);
}
public boolean isdashboardisdisplayed() {
	return dashboard.isDisplayed();
	}
}
