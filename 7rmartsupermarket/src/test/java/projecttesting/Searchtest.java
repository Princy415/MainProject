package projecttesting;

import org.testng.annotations.Test;

import pages.Adminon;
import pages.Homepage;
import pages.Loginpage;
import pages.Search;

public class Searchtest extends Base {
	
	Homepage home;
	Adminon admin;
	Search search;
	@Test
	public void search()
	{
	Loginpage loginpage=new Loginpage(driver);
	loginpage.addUserNamePassword("admin","admin");
	home=loginpage.ClickOnSignin();
	admin=home.clickonadminuser();///
	search=admin.clicksearch();
	search.entername("janis.ledner").dropdown().clickon();
	
	
	
	//Adminon adminpage=new Adminon(driver);
	//adminpage.clickonadminuser();
	//Search search=new Search(driver);
	//search.clicksearch();
	//search.entername("princy");
	//search.dropdown();
	//search.clickon();


}
}