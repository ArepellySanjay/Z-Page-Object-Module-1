package OrangeHRM_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utils.UtilsDemo;

public class UserRegistration_page extends UtilsDemo
{

	//create object repository
	
	@FindBy(linkText = "Admin")
	WebElement admin_link;
	
	@FindBy(id = "btnAdd")
	WebElement user_element;
	
	@FindBy(id = "systemUser_userType")     // remember
	WebElement user_role;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employee_name;
	
	
	@FindBy(name = "systemUser[userName]")
	WebElement user_name; 
	
	@FindBy(xpath =  "//input[@type = 'password']")
	WebElement password;
	
	@FindBy(name = "systemUser[confirmPassword]")
	WebElement confirm_pword;
	
	
	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement save_element;
	
	@FindBy(id = "searchSystemUser_userName")      // searchSystemUser_userName
	WebElement username_element;                 // name='searchSystemUser[userName]']"}
			  
	
	@FindBy(id = "searchBtn")
	WebElement search_element;
	
	//@FindBy(id = "resultTable")
	//WebElement table_element;
	
	
     @Test
	public boolean UserRegistration(String role,String empname,String uname,String pword) throws InterruptedException 
	{
		
    	 admin_link.click();
    	 user_element.click();
    	 employee_name.sendKeys(empname);
    	 user_name.sendKeys(uname);
    	 password.sendKeys(pword);
    	 
    	 confirm_pword.sendKeys(pword);
    	 save_element.click();
    	 
    	 username_element.sendKeys(uname);
    	 Thread.sleep(2000);
    	 search_element.click();
    	    	 
    WebElement restable =	driver.findElement(By.id("resultTable"));
    	 List<WebElement>rows = restable.findElements(By.tagName("tr")); 
    	
    	 boolean isdisplayed = false;
    	 
    	 for(int i=1;i<rows.size();i++)
    	 {
    		List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
    		if(cols.get(1).getText().equals(uname))    				
    		{
    			return true;    			
    		}else
    		{
    			
    		}
    				
    		
    	 }
		return isdisplayed;
    	 
    	 
	}
	
	
}












