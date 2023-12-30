package OrangeHRM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmoployeeReg_page 
{

	//create object repository
	@FindBy(linkText = "PIM")
	WebElement pim_element;
 
	@FindBy(linkText = "Add Employee")
	WebElement aad_employee;
	
	@FindBy(id = "firstName")
	WebElement firstname_element;
	
	@FindBy(id = "lastName")
	WebElement lastname_element;
	
	@FindBy(name = "employeeId")
	WebElement empid_element;
	
	@FindBy(id = "btnSave")
	WebElement save_element;
	

	
	public void EmpResgistration(String fname,String lname) 
	{
		pim_element.click();		
		aad_employee.click();
		firstname_element.sendKeys(fname);
		lastname_element.sendKeys(lname);
		
	String san =	empid_element.getAttribute("value");
	
	 
		
		
	}
	
}
