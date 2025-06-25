package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']")WebElement admin ;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")WebElement logout;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[2]")WebElement managecategory;
    @FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'])[2]")WebElement managenews;
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]")WebElement adminuser;
	public Homepage signout() 
	{
		admin.click();
		logout.click();
		return this;
	}
	 public Adminon clickonadminuser() 
	    {
	     adminuser.click();
	     return new Adminon(driver);
	   
	    }
	 public ManageNews clickfirst()
	 {
		 managenews.click();
		 return new ManageNews(driver);
	 }
	
	 public  ManageCategory clickmanagecategory()
		{
			managecategory.click();
			return new ManageCategory(driver);
			}
	
}


