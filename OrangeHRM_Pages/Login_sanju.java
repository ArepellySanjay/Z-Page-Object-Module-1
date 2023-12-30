package OrangeHRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.UtilsDemo;

public class Login_sanju extends UtilsDemo
{

	//create object repository
	@FindBy(id ="txtUsername")
	WebElement ui_element;
	
	
	@FindBy(id = "btnLogin")
	WebElement pwd_element;
	
	@FindBy(xpath ="//input[@value = 'LOGIN']")
	WebElement login_link;
	
	@FindBy(id ="menu_admin_viewAdminModule")
	WebElement admin_link;
	
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcome_link;
	  
	
	@FindBy(linkText = "Logout")
	WebElement logout_link;
	
	
	public void Login(String ui , String pwd)
	{
		
		ui_element.sendKeys(ui);
		
		pwd_element.sendKeys(pwd);
		
		
		
		
	}
	
	public boolean isAdminloginDisplay()
	{
		
	if(admin_link.isDisplayed())
	{
		return true;
		
	}else
		return false;
		
	}
	
	
	
	public void logout() 
	{
		
		welcome_link.click();
		logout_link.click();
		
	}
	
}
