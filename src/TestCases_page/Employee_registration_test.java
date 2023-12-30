package TestCases_page;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRM_page.Empolyee_page;
import OrangeHRM_page.Login_page;
import Utils.UtilsDemo;

public class Employee_registration_test extends UtilsDemo
{
     
	 @Test
	public void EmpReg() 
	{
		
		 Login_page lp = PageFactory.initElements(driver, Login_page.class);
		 lp.Login("Admin","Qedge123!@#");
		 
		 
		 
		Empolyee_page ep = PageFactory.initElements(driver, Empolyee_page.class);
		ep.EmployeRegistration("nitin", "Demo");
		
		
		
	}
	
	
}
