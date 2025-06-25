package projecttesting;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;
import pages.Homepage;
import pages.Loginpage;
import retry.Retry;
import utility.ExcelUtility;

public class Logintest extends Base
{
	Homepage home;//globally declares home reference variable
	
@Test(retryAnalyzer = retry.Retry.class)
public void validateWhetherUserCanAbleToLogin() throws IOException
{
	Loginpage loginpage=new Loginpage(driver);
	String username=ExcelUtility.getStringdata(1, 2, "loginpagetest");
	String password=ExcelUtility.getStringdata(1, 1,"loginpagetest");
	loginpage.addUserNamePassword(username,password);
	home=loginpage.ClickOnSignin();
	String expected="login|7rmart supermarket";
	String actual= driver.getTitle();
	boolean ishomepageisloaded=loginpage.isdashboardisdisplayed();
	Assert.assertEquals(expected,actual,Constants.ISTITLENOTMATCHED);
}
public void loginwithInvalidusernameAndvalidpassword() {
	Loginpage loginpage=new Loginpage(driver);
}
@Test(groups = {"regressiontest"})


@Parameters({"username","password"})
public void parameterViaLogin(String username,String password)
{
	Loginpage loginpageproject=new Loginpage(driver);
	loginpageproject.addUserNamePassword(username,password);
	loginpageproject.ClickOnSignin();
}
@Test(dataProvider = "credentials", groups = {"regessiontest"})
public void dataprovider(String username,String password)
{
	Loginpage loginpageproject=new Loginpage(driver);
	loginpageproject.addUserNamePassword(username,password);
	loginpageproject.ClickOnSignin();
}
@DataProvider(name = "credentials") 
	public Object[][] testData() { 
		Object data[][] = { { "admin", "admin"},{"admin123","admin"} }; 
		return data;
}
}

