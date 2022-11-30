package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cwalogin 

{
	
	public static WebDriver driver;
	
	@FindBy(id="UserName")
	WebElement emailaddress;
	
	
	@FindBy(id="Password")
	WebElement key;
	

	@FindBy(css=".btn.btn-success.btn-login")
	WebElement loginbutton;
	
	
	
	
	
	
	public cwalogin (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this );
		this.driver= driver;
		
	}
	
	public void LoginScreen(String email, String pass)
	{
		try {
		
		emailaddress.sendKeys(email);
		
		key.sendKeys(pass);
		
		
		loginbutton.click();
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		}
		
		
		
	}
	
