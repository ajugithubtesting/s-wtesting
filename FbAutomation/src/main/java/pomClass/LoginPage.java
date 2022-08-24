package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='remember']")
	private WebElement keepMeLoginCheckbox;
	
	@FindBy(xpath="//a[@class='initial']")
	private WebElement login;
	
	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void senduserName() {
		userName.sendKeys("Admin");
	}
	public void sendpasswordName() {
		password.sendKeys("manager");
	}
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	public void clickOnLoginButton() {
		login.click();
	}
	
	//Or
	
	public void loginToApplication() {
	userName.sendKeys("Admin");
	password.sendKeys("manager");
	keepMeLoginCheckbox.click();
	login.click();
	
	
	}
	
}
	
	
	
	
	
	
	
	
	


