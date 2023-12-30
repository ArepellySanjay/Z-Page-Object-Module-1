package OrangeHRM_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utils.UtilsDemo;

public class Login_page  extends UtilsDemo
{

	
	
		
		//object repository
		
		@FindBy(id = "txtUsername")
		WebElement uid_element;
		
		@FindBy(id = "txtPassword")
		WebElement pwd_element;
		
		@FindBy(xpath = "//input[@value='LOGIN']")
		WebElement login_link;
		
		@FindBy(partialLinkText = "Welcome")
		WebElement welcome_link; 
		
		@FindBy(linkText = "Logout")
		WebElement logout_link;
		
		@FindBy(linkText = "Admin")
		WebElement admin_link; 
		
		@FindBy(id = "spanMessage")
		WebElement ErrMsg_link;
		
		
		
	
		public void Login(String uid, String pwd)
		{
			
			uid_element.sendKeys(uid);
			pwd_element.sendKeys(pwd);
			login_link.click();
			
		}

		public boolean isAdminModule()
		{
		
			 if(admin_link.isDisplayed())
			 {
				 return true;
			 }else
				 return false;
			
		}
		
		public boolean isErrMsgDisplayed()
		{
		String errmsg =	ErrMsg_link.getText();
		if(errmsg.toLowerCase().contains("invalid") || errmsg.contains("empty"))
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
	

