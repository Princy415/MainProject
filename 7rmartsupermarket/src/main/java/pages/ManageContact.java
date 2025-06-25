package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact {
	public WebDriver driver;
	public ManageContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@class='small-box-footer'])[3]")WebElement managecontact;
	@FindBy(xpath="(//td['8909654633'])[1]")WebElement phonenumber ;
	@FindBy(xpath="(//td['8909654633'])[2]")WebElement mailid ;
	@FindBy(xpath="(//td['8909654633'])[3]")WebElement address;
	@FindBy(xpath="(//td['8909654633'])[4]")WebElement deliverytime ;
	@FindBy(xpath="(//td['8909654633'])[5]")WebElement deliverychargelimit;
	@FindBy(xpath="(//td['8909654633'])[6]")WebElement action ;


public ManageContact clickmanagecategory() {
	managecontact.click();
	return this;
	}
public ManageContact enterphonenumber() {
	phonenumber.sendKeys("9836622272");;
	return this;
	}
public ManageContact entermailid() {
	mailid.sendKeys("princypradeep25@gmail.com");
	return this;
	}
public ManageContact address() {
	address.sendKeys("newvilla");
	return this;
	}
public ManageContact deliverytime() {
	deliverytime.sendKeys("4pm");
	return this;
}
public ManageContact  deliverychargelimit(String string) {
	deliverychargelimit("300rs");
	return this;
}
public ManageContact action() {
	action.click();
	return this;
	
}

}