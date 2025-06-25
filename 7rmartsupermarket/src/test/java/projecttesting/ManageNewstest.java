package projecttesting;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Adminon;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageNews;
import pages.Search;
import utility.ExcelUtility;

public class ManageNewstest extends Base {
	Homepage home;
	ManageNews manage;
	@Test(retryAnalyzer=retry.Retry.class)
	public void entermanagenews() throws IOException {
		
			Loginpage loginpage=new Loginpage(driver);
			loginpage.addUserNamePassword("adminnnn","adminnnn");
			String username=ExcelUtility.getStringdata(1, 0, "managenew");
			String password=ExcelUtility.getStringdata(1, 1,"managenew");
			home=loginpage.ClickOnSignin();
			manage=home.clickfirst();
			manage.clicksecond().enternews("it's ok").presssave();
			

	}
	


}
