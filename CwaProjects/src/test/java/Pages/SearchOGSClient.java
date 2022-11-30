package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchOGSClient 
{
	
	WebDriver driver;
	
	
	@FindBy(css=".form-control.input-sm")
	WebElement searchbox;
	
	
	@FindBy(xpath="//td[@class='col sorting_1']")
	List<WebElement> listofclients;
	
	//td[@class='col sorting_1']
	
	@FindBy(xpath="//*[@id=\"tblDetails\"]/tbody/tr/td/a")
	 List<WebElement>  clientslink;
	
	@FindBy(linkText="OGSRFQInfo")
	WebElement leftmenu;
	
	
	
	 
	public SearchOGSClient(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void searchclient(String enterclient) throws InterruptedException
	{
		Thread.sleep(3000);
		searchbox.sendKeys(enterclient);
		
		System.out.println(enterclient);
		
	}
	

	public void clients(String clientname) throws InterruptedException
	
	{	
		for (WebElement e : clientslink )
		{
			System.out.println(e.getText());
			
			if(e.getText().equals(clientname))
			{
				e.click();
				
				Thread.sleep(5000);
			}
		}
		}
	
	
	 public void Leftmenulinks() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 leftmenu.click();
	 }
	 }
	
	    
		
	
    
	
		    	 	    	 
		  
	
	
			
		
	
	
	
	


