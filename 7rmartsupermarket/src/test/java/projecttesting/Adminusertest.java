package projecttesting;



import java.io.IOException;

import org.testng.annotations.Test;

import pages.Adminon;
import pages.Homepage;
import pages.Loginpage;
import utility.ExcelUtility;
import utility.FakerUtility;

public class Adminusertest extends Base{
	Homepage home;
	Adminon admin;
	@Test
	public void adminuser() throws IOException, InterruptedException
	{
		Loginpage loginpage=new Loginpage(driver);
		//String username=ExcelUtility.getStringdata(1, 0, "admintest");
		//String password=ExcelUtility.getStringdata(1, 1,"admintest");
		loginpage.addUserNamePassword("admin","admin");
	home=loginpage.ClickOnSignin();
		admin=home.clickonadminuser();
		FakerUtility fk=new FakerUtility();
		String usernamefaker=fk.getFakeFirstName();
		String passwordfaker=fk.getPassword();
	
	admin.fresh().enterUsernamePassword(usernamefaker, passwordfaker).drop().last();
	
		//Adminon adminpage=new Adminon(driver);
		//home=adminpage.clickonadminuser();
		
		
		
	
	}
}

