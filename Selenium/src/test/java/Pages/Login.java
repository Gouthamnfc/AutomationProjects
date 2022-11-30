package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login

{
	
	WebDriver driver;
	
	@FindBy(id="UserName")
	WebElement emailaddress;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(css=".btn.btn-success.btn-login")
	WebElement loginbutton;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void Userlogin(String email,String key)
	{
		emailaddress.sendKeys(email);
		
		pass.sendKeys(key);
		
		loginbutton.click();
	}

}
