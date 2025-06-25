package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utility.Fileuploadutility;

public class ManageCategory {
	 private static final @Nullable Object clicksave = null;
	public WebDriver driver;
	Fileuploadutility file=new Fileuploadutility();
	 public  ManageCategory(WebDriver driver) 
	 {
     this.driver=driver;
     PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement categorynew;
	@FindBy(xpath="//input[@type='text']")WebElement categorycat;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discountclik;
	@FindBy(id="main_img")WebElement choose;
	@FindBy(xpath="//button[@type='submit']")WebElement savesafe;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement searchcat;
	public  CategorySearch searchcat() {
		searchcat.click();
		return new CategorySearch(driver);
	}
	
	
	public   ManageCategory clickcategorynew() {
		categorynew.click();
		return this;
	}
	public ManageCategory entercategory(String datafield) {
		 categorycat.sendKeys(datafield);
		return this;
		}
	public ManageCategory clickdiscount() 
	{
		discountclik.click();
		return this;
		}
	public ManageCategory  scrolldown()
	{
		JavascriptExecutor javascript=(JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].click();",savesafe);
		return this;
		}
	public ManageCategory chooseSelect()
		 {
		file.sendkeysforfileupload(choose,Constants.IMGPATH);
	//choose.sendKeys("C:\\Users\\princ\\Desktop\\istockphoto-2166282428-2048x2048.jpg");
		   return this;
		   }
	
	public  ManageCategory clicksave()
	{
		JavascriptExecutor javascript = (JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].click();",clicksave());
		return this;
		
	}

}
