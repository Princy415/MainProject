package projecttesting;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;

public class Homepagetest extends Base 
{
Homepage home;	
@Test
public void signout() 
{
	Loginpage loginpage=new Loginpage(driver);
	loginpage.addUserNamePassword("admin","admin");
	home=loginpage.ClickOnSignin();
	home.signout();
	//Homepage logout=new Homepage(driver);
	//logout.signout();
}

}
