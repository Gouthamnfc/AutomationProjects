package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SearchOGSClient;
import Pages.cwalogin;


public class LoginTest
{
	
	public static WebDriver driver;
	
	
	@Test
	public void cwapwa()
	{
		try {
		
		cwalogin cwa = new cwalogin(driver);
		cwa.LoginScreen("pkadrikar@tempositions.com", "test123");
		
		SearchOGSClient sc = new SearchOGSClient(driver);
		sc.searchclient("OGS");
		sc.clients("OGS- client 1");
		sc.Leftmenulinks();
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
	
	
	
	@BeforeTest
	public void browserlogin()
	{
		try
		{
		System.out.println("Searching for the driver");
	
		System.setProperty("webdriver.chrome.driver",  "C:\\ChromeDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apps.tempositions.com/cwa2dev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Site loaded successfully");
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		}
	
	@AfterTest
	public void Browserclose()
	{
		driver.close();
		System.out.println("Browser Closed Successfully");
		
	}

}
