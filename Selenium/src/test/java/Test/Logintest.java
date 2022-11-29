package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Login;

public class Logintest 
{
	WebDriver driver;
	@Test
	public void swaglogin()
	{
		Login l1= new Login(driver);
		l1.Userlogin();
	}
	
	
	@BeforeTest
	public void launchbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver ch= new ChromeDriver();
		
		ch.get("https://www.saucedemo.com");
		
		ch.manage().window().maximize();
	}
	
	

}
