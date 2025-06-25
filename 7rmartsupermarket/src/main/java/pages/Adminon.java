package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adminon {
	 WebDriver driver;
	public Adminon(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement New;
    @FindBy(xpath="(//input[@class='form-control'])[2]") WebElement username;
    @FindBy(xpath="//input[@id='password']") WebElement password;
    @FindBy(xpath="//select[@id='user_type']") WebElement usertype;
    @FindBy(xpath="(//button[@type='submit'])[2]")WebElement save;
	public WebElement Save;
    @FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search ;
    public Search clicksearch()
    {
    	search.click();
    	return new Search(driver);
    }
  public Adminon fresh() {
	  New.click();
	return this;
  }
 
  public Adminon enterUsernamePassword(String usernamefield,String passwordfield)
     {
      username.sendKeys(usernamefield);
      password.sendKeys(passwordfield);
	return this;
     }
  
  public Adminon drop() 
  {	
   Select select = new Select(usertype);
   select.selectByVisibleText("Admin");
return this;
   }


	
  public Adminon last() {
	  save.click();
	return this;
	  
	}
	
	

}





