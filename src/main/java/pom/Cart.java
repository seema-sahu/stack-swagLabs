package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy (xpath = "//button[text()='Remove']")private WebElement remove;
	@FindBy (xpath = "//div[@class='inventory_item_name']")private WebElement productname;
	@FindBy (xpath = "//button[@id='checkout']")private WebElement checkout;
	@FindBy (xpath = "//button[@id='continue-shopping']")private WebElement continueshopping;
	
	public Cart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void removeFromCart() {
		remove.click();
	}
	public void clickProductName() {
		productname.click();
	}
	public void clickCheckout() {
		checkout.click();
	}
	public void clickContinueShopping() {
		continueshopping.click();
	}

}
//button[text()='Remove']

