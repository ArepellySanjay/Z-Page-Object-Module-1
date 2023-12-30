package TestCases_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.Login_page;
import Utils.UtilsDemo;

public class Adminlogin  extends  UtilsDemo
{
     @Test
	public void checkAdminLogin() 
	{
		
		Login_page lp = PageFactory.initElements(driver, Login_page.class);
		lp.Login("Admin", "Qedge123!@#");
	  boolean res =	lp.isAdminModule();
		lp.Logout();
		
		
	}
	
	
}