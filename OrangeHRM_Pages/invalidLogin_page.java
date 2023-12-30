package OrangeHRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utils.UtilsDemo;

public class invalidLogin_page extends UtilsDemo
{
   //create object repository
    
	
	@FindBy(id = "txtUsername")
	WebElement uid_element;
	
	@FindBy(id = "txtPassword")
	WebElement pwd_element;
	
	@FindBy(xpath = "//input[@value ='LOGIN']")
	WebElement login_link;
	
	@FindBy(id = "spanMessage")
	WebElement erro_element;
	
	   
	
	
public void invalid(String uid,String pwd) 
{
	
	
	uid_element.sendKeys(uid);
	pwd_element.sendKeys(pwd);
	login_link.click();
	
} 
	
public boolean isErrMesgDisplaye() 
{
	
	//if(erro_element.getText().contains(url)
        
     String sanju =  erro_element.getText();
     if(sanju.toLowerCase().contains("invalid") || sanju.toLowerCase().contains("empty"))
     { 
    	return true;
     }else
    	 return false;
}

  
    	
    	
		
	}













