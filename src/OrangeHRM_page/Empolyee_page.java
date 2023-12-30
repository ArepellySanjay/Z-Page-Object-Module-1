package OrangeHRM_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.UtilsDemo;

public class Empolyee_page  extends UtilsDemo
{
	
	//object repository
	
	
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement pim_element;
	
	
	@FindBy(id = "menu_pim_addEmployee")
	WebElement add_element;
	
	@FindBy(name = "firstName")
	WebElement firstname_element;
	
	@FindBy(id = "lastName")
	WebElement lastname_element;
	
	
	
	@FindBy(id = "employeeId")
	WebElement employeid_element;
	
	@FindBy(xpath = "//input[@value = 'Save']")
	WebElement save_element;
	
	@FindBy(linkText = "Employee List")
	WebElement emplist_element;
	
	@FindBy(id = "empsearch_id")
	WebElement id_element;
	
	@FindBy(id = "searchBtn")
	WebElement search_button;
	
	
	public boolean EmployeRegistration(String fname, String lname) 
	{
		
		pim_element.click();
		add_element.click();
		firstname_element.sendKeys(fname);
		lastname_element.sendKeys(lname);
	String empid =	employeid_element.getAttribute("value");
	save_element.click();
	emplist_element.click();
	
	id_element.sendKeys(empid);
	search_button.click();
	
	
     WebElement restable;
     restable =	driver.findElement(By.id("resultTable"));
      
  List<WebElement>row =   restable.findElements(By.tagName("tr"));
     
     boolean    isdisplayed = false;
  
	   for(int i =1;i<=row.size();i++)
	   {
		   
		 List<WebElement>cols =  row.get(i).findElements(By.tagName("td"));
		 if(cols.get(i).getText().equals(empid))
		 {
			 return true;
		 }else
		 {
			 return false;
		 }
		 
	   }
	return isdisplayed;
  
  
  
	}

}
