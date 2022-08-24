package testpack;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pomClass.ApplicationHeader;
import pomClass.LoginPage;

public class HardAssertion {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Desktop\\Velocity\\Automation\\Selenium\\chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	      
	      //1st test case
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
	 
         //	Methods of Hard Asserts
	 
	 //actual result is equals to expected result then test case is passed
	 //actual result is not  equals to expected result then test case is failed
	 Assert.assertEquals(actual, expected);
	 
	 
	 //actual result is equals to expected result then test case is failed
	 //actual result is not equals to expected result then test case is failed
	 Assert.assertNotEquals(actual,expected);
	 
	 boolean result=url.equals("http://localhost/tasks/otasklist.do");
	 
	 
	 
	 //result==>true==> test case =passed
	 //result==>false==> test case =failed
	 Assert.assertTrue(result);
	 
	 
	 
	 
	 //result==>true==> test case =failed
	 //result==>false==> test case =pass
	 Assert.assertFalse(result);
	 
	 
	 //forcefully failed the test case.
	 Assert.fail();

	 
	 

	 
	// Assert.assertEquals(url,"http://localhost/tasks/otasklist.do","URL is not correct " );
	// Assert.assertEquals(title,"actiTIME -  Open Tasks" );



//	 if(url.equals("http://localhost/tasks/otasklist.do") && title.equals("actiTIME -  Open Tasks"))
//	 {
//	 System.out.println("Pass");
//	}
//	else
//	{
//		System.out.println("Fail");
//	}
//	 applicationHeader. ClickOnLogout();
	}

}
