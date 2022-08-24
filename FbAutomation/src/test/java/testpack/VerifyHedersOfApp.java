package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClass.ApplicationHeader;
import pomClass.LoginPage;

public class VerifyHedersOfApp {
	WebDriver driver;
	LoginPage loginPage;
	ApplicationHeader applicationHeader;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browserName) {
		if (browserName.equals("Chrome"))
		{
			   driver.Base.openChromeBrowser();
			   }
	     if (browserName.equals("Firefox"))
			{
		     driver.Base.openFirefoxBrowser();
			}
		     if (browserName.equals("Opera"))
				{
			     driver.Base.operaBrowser();
				}
	      driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	@BeforeClass
	public void createPOMObject() {
	  loginPage=new LoginPage(driver);
	 applicationHeader= new ApplicationHeader(driver);
	}
	
@BeforeMethod
	public void loginPageToApplication() {
	  driver.get("http://localhost/login.do");

	  loginPage.senduserName();
	  loginPage.sendpasswordName();
	  loginPage.selectKeepMeLogin();
	  loginPage.clickOnLoginButton();
	}
	@Test
	public void verifyTaskButton() {
		SoftAssert soft = new SoftAssert();
		 applicationHeader.openTaskPage();
		  
		 String url= driver.getCurrentUrl();
		 String title=driver.getTitle();
		 soft.assertEquals(url,"http://localhost/tasks/otasklist.do" ,"massage");
		 soft.assertEquals(title,"actiTIME -  Open Tasks");
		 soft.assertAll();
	}
	@Test
	public void verifyReportButton() {
		applicationHeader.openReportsPage();
		 String url= driver.getCurrentUrl();
		 String title=driver.getTitle();
		 if(url.equals("http://localhost/tasks/otasklist.do") && title.equals("actiTIME -  Open Tasks"))
			 {
			 System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			}
		 
	@AfterMethod
	public void logoutFromApplication() {
		applicationHeader.ClickOnLogout();
	}
	@AfterClass
	public void clearObject() {
		loginPage=null;
		applicationHeader=null;
	}
		@AfterTest
		public void closedBrowser() {
			driver.close();
			driver=null;
			System.gc();  //garbage collector
		}
	
}	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	


