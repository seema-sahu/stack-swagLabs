package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {
	@FindBy (xpath = "//input[@id='first-name']")private WebElement firstname;
	@FindBy (xpath = "//input[@id='last-name']")private WebElement lastname;
	@FindBy (xpath = "//input[@id='postal-code']")private WebElement zipcode;
	@FindBy (xpath = "//input[@id='continue']")private WebElement continu;
	@FindBy (xpath = "//button[@id='cancel']")private WebElement cancel;
	
	public YourInformationPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	public void enterZipCode(String Zcode) {
		zipcode.sendKeys(Zcode);
	}
	public void clickContinue() {
		continu.click();
	}
	public void clickCancel() {
		cancel.click();
	}

}
