package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login

{
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void Userlogin()
	{
		username.sendKeys("standard_user");
		
		password.sendKeys("secret_sauce");
		
		loginbutton.click();
	}

}
