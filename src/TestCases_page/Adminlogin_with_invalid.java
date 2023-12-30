package TestCases_page;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.Login_page;
import Utils.UtilsDemo;

public class Adminlogin_with_invalid  extends UtilsDemo
{
     @Test
	public void adminloginWithInvalid()
	{
		
		Login_page lp =PageFactory.initElements(driver, Login_page.class);
		lp.Login("skn", "kslhc");
       boolean res = lp.isErrMsgDisplayed();				
		Assert.assertTrue(res);
		
		
	}
	
	
}
