package Test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddEmployeePage;
import Util.ConstantsPage;
import Util.DBUtil;


public class AddEmployeeScrapingTest 
{
	
	WebDriver driver;
	
	
	@Test
	 public void AddEmployeetoShiftWise() throws Exception
	 {
		   AddEmployeePage Ap = new AddEmployeePage(driver);
		   
		   ArrayList <String> logins= DBUtil.GetloginDetails();
		   
		   for (int i = 0; i < logins.size(); i++) {
				System.out.println(logins.get(i));
				String strUserDetails = logins.get(i);
				String[] arrLoginDetails = strUserDetails.split(",");
				String client_id = arrLoginDetails[0];
				String app_login = arrLoginDetails[1];
				String app_pwd = arrLoginDetails[2];
				
				if (driver.getTitle().contains("login"))
				{
					Ap.Login(app_login, app_pwd, client_id);
				}
				
		   }
	 }
	 
	 
	 
	
	 @BeforeMethod
		public void Browserstart() {
			try {
				System.out.println("Searching for the driver");
		//		String user_dir = System.getProperty("user.dir");
		//		System.setProperty("webdriver.chrome.driver", user_dir + "\\chromedriver.exe");
				
				
			  System.setProperty("webdriver.chrome.driver", "C:\\newchrome\\chromedriver_win32\\chromedriver.exe");
			   
				driver = new ChromeDriver();
				driver.get("https://secure.shiftwise.net/esp/login/login.aspx");
				System.out.println("Site loaded successfully");
				driver.manage().window().maximize();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Unable to get the driver");
				
			}

		}

		@AfterMethod
		public void Browserclose() {
			driver.quit();
			System.out.println("Browser Closed Successfully");
			
			
		}

	}


