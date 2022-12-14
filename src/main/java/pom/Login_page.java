package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
		@FindBy (xpath= "//input[@id='user-name']")private WebElement userName;
		@FindBy (xpath= "//input[@type='password']")private WebElement password;
		@FindBy (xpath= "//input[@id='login-button']")private WebElement login;
	
		public Login_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void enteruserName(String UN) {
			userName.sendKeys(UN);
		}
		public void enterPassword(String pw) {
			password.sendKeys(pw);
		}
		public void clickOnlogin() {
			login.click();	
		}	
}
	
