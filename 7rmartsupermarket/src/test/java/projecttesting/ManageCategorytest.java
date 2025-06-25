package projecttesting;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.ManageCategory;
import utility.ExcelUtility;

public class ManageCategorytest extends Base {
	Homepage home;
	ManageCategory cat;
	
	@Test
	public void  entermanagecategory() throws IOException
	{

		Loginpage loginpage=new Loginpage(driver);
		String username=ExcelUtility.getStringdata(1, 0, "managecategory");
		String password=ExcelUtility.getStringdata(1, 1,"managecategory");
		loginpage.addUserNamePassword(username,password);
		home=loginpage.ClickOnSignin();
		cat=home.clickmanagecategory();
		cat.clickcategorynew().entercategory(ExcelUtility.getStringdata(1, 2, "managecategory")).clickdiscount().scrolldown().chooseSelect().clicksave();
		
	}
	

}

