package TestCases_page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.Login_page;
import OrangeHRM_page.UserRegistration_page;
import Utils.UtilsDemo;

public class UserRigistration_Test extends UtilsDemo 
{
     
	@Test
	public void  userRig() throws InterruptedException 
	{
		
		Login_page lp =PageFactory.initElements(driver, Login_page.class);
		lp.Login("Admin", "Qedge123!@#");
		UserRegistration_page ug = PageFactory.initElements(driver, UserRegistration_page.class);
		ug.UserRegistration("ESS", "Arepelly sanjay", "mateen", "Mateen123!@#");
	    lp.Logout();
		
	}
	
	
}
