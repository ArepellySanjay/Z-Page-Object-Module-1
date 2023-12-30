package OrangeHRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.UtilsDemo;

public class Login_Page extends UtilsDemo
{

	//create object Repository
	
	
	@FindBy(id ="txtUsername")
	WebElement uid_element;
	
	
	@FindBy(id= "txtPassword")
	WebElement pwd_element;
	
	
	@FindBy(xpath ="//input[@value='LOGIN']")
	WebElement login_element;
	
	
	@FindBy(linkText = "Admin")
	WebElement admin_Link;
	
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcome_link;
	
	
	@FindBy(linkText = "Logout")
	WebElement logout_link;
	
	public void Login(String uid, String pwd) 
	{
		
		uid_element.sendKeys(uid);
		pwd_element.sendKeys(pwd);
		login_element.click();
		
		
		
	}
	
	
	public boolean isAdminModuleDisplayed() 
	{
		
		if(admin_Link.isDisplayed())
		{
		
			return true;
		}else
			return false;
		
	}
	
	public void Logout()
	{
		
		welcome_link.click();
		logout_link.click();
		
	}
}
