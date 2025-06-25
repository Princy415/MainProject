package projecttesting;

import org.testng.annotations.Test;

import pages.CategorySearch;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageCategory;

public class CategorySearchtest extends Base{
	Homepage home;
	ManageCategory category;
	CategorySearch search;
@Test

public void searchcategory() {
	

		Loginpage loginpage=new Loginpage(driver);
		loginpage.addUserNamePassword("admin","admin");
		home=loginpage.ClickOnSignin();
		category=home.clickmanagecategory();
		search=category.searchcat();
		search.category().save();
		
		
	}
}

