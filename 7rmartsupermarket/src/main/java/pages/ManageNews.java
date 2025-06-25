package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews 
{
	 WebDriver driver;
	public ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement managenew;
	    @FindBy(xpath="//textarea[@id='news']")WebElement news;
	    @FindBy(xpath="//button[@name='create']")WebElement managesave;
	   
	   public ManageNews clicksecond()
	   {
		   managenew.click();
		   return this;
	   }
	   public ManageNews enternews(String newsfield )
	   {
		   news.sendKeys(newsfield);
		   return this;
	   }
	   public ManageNews presssave()
	   {
		   managesave.click();
		   return this;
	   }
}