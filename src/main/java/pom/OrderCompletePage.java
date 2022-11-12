package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletePage {
	@FindBy (xpath = "//a[@class='shopping_cart_link']")private WebElement cart;
	@FindBy (xpath = "//button[text()='Back Home']")private WebElement backhome;
	@FindBy (xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thankutext;
	
	public OrderCompletePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openCart() {
		cart.click();
	}
	public void clickBackHome() {
		backhome.click();
	}
	public void verifyText() {
		thankutext.isDisplayed();
	}
	

}
//h2[text()='THANK YOU FOR YOUR ORDER']

