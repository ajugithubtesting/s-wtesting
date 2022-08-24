package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
		
		@FindBy(xpath="//a[@class='content tasks']")
		private WebElement tasks;
		
	   @FindBy(xpath="//a[@class='content reports']")
		private WebElement reports;
		
	   @FindBy(xpath="//a[@class='content users']")
	   private WebElement users;
	   
	   @FindBy(xpath="//a[text()='Logout']")
	   private WebElement logout;
	

		public   ApplicationHeader (WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		public void openTaskPage() {
			tasks.click();
		}
		public void openReportsPage() {
			reports.click();
		}
		public void openUserList() {
			users.click();
		}
		public void ClickOnLogout() {
			logout.click();
		
		
	} 
}

