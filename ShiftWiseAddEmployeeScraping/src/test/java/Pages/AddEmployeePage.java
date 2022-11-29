package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage
{
	
	WebDriver driver;
	
	
	@FindBy(id="UsernameInput")
	WebElement usename;
	
	@FindBy(id="NextButton")
	WebElement nextbutton;
	
	@FindBy(id="PasswordInput")
	WebElement password;
	
	@FindBy(id="LoginButton")
	WebElement loginbutton;
	
	
	public AddEmployeePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public  void  Login(String emailaddress, String Password, String client_id)
	{
		
	           usename.sendKeys(emailaddress);
	           
	           nextbutton.click();
	           
	           password.sendKeys(Password);
	           
	           loginbutton.click();
	           
		
	}
	
	

}
