package OrangeHRM_Pages;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utils.UtilsDemo;

public class UserRegitrationPage   extends UtilsDemo
{
	
	
	@FindBy(linkText = "Admin")
	WebElement admin_link;
	
	@FindBy(id = "btnAdd")
	WebElement aad_element;
	
	@FindBy(id = "systemUser_userType")
	WebElement role_link;
	
    @FindBy(id = "systemUser_employeeName_empName")	
	WebElement empid_element;
    
    @FindBy(id = "systemUser_userName")
    WebElement username_element;
    
    @FindBy(id = "systemUser_password")
    WebElement pword_element;
    
    @FindBy(id = "systemUser_confirmPassword")
   WebElement con_element;
    
    @FindBy(id = "btnSave")
    WebElement save_element;
    
    @FindBy(id = "searchSystemUser_userName")
    WebElement search_element;
   
    @FindBy(id = "searchSystemUser_userNamei")
    WebElement username_element1;

	public boolean UserReg(String role,String empname,String uname,String pword) 
	{
		
	admin_link.click();
	aad_element.click();	
	//role_link.click();

	
	empid_element.sendKeys(empname);
	username_element.sendKeys(uname);
	pword_element.sendKeys(pword);
	con_element.sendKeys(pword);
	save_element.click(); 
	search_element.sendKeys(uname);
	username_element.click();

	
	WebElement restb;
   restb =	driver.findElement(By.id("resultTable"));
   List<WebElement>tr =	restb.findElements(By.tagName("tr"));
 
   
   boolean result = false;
   
	   for(int i=1;i<=tr.size();i++)
	     {
		 List<WebElement>cols =  tr.get(i).findElements(By.tagName("td"));
		   if(cols.get(i).getText().equals(uname))
		   {
			   result= true;
			   break;
		   }
		 
	     }
	return result;
	  
	}
	
	
	
	
	
	
	
	
	
}
