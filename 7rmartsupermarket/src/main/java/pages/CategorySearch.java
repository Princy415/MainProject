package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategorySearch {
	
	WebDriver driver;
	 CategorySearch(WebDriver driver)
	 {
this.driver=driver;
PageFactory.initElements((SearchContext) this, driver);
	 }
	 
	 @FindBy(xpath="//input[@class='form-control']")WebElement category;
	 @FindBy(xpath="//button[@type='submit']")WebElement save;
	 


public  CategorySearch category() {
	category.sendKeys("princy");
	return this;
}
public CategorySearch save() {
	save.click();
	return this;
}

}




