package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.ApplicationHeader;
import pomClass.LoginPage;

public class TestClass {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\Velocity\\Automation\\Selenium\\chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      
	      //1st testcase
	      driver.get("http://localhost/login.do");
	      LoginPage loginPage=new LoginPage(driver);
	      
	  loginPage.senduserName();
	  loginPage.sendpasswordName();
	  loginPage.selectKeepMeLogin();
	  loginPage.clickOnLoginButton();
	  
	  ApplicationHeader applicationHeader= new ApplicationHeader(driver);
	  applicationHeader.openTaskPage();
	  
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
	 applicationHeader. ClickOnLogout();
	 
	// 2nd testcase
     driver.get("http://localhost/login.do");
      loginPage =new LoginPage(driver);
      loginPage.senduserName();
	  loginPage.sendpasswordName();
	  loginPage.selectKeepMeLogin();
	  loginPage.clickOnLoginButton();
	  
	   applicationHeader= new ApplicationHeader(driver);
	   applicationHeader.openReportsPage();
	   
	     url= driver.getCurrentUrl();
	     title=driver.getTitle();
		 
		 if(url.equals("http://localhost/reports/reports.do") && title.equals("actiTIME -  Saved Reports"))
		 {
		 System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	  
		 applicationHeader. ClickOnLogout();
         
		 driver.close();
  
	  
	  
	  //this is your complete testclass
	  
	  
	  
	  
	  
	  
	 
	 
	 
	 
	 
	 
	}

}

