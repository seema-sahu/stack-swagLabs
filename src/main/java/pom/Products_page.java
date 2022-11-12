package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Products_page {

	@FindBy (xpath = "//button[text()='Open Menu']")private WebElement menu;
	@FindBy (xpath = "//select[@class='product_sort_container']")private WebElement filter;
	@FindBy (xpath = "//a[@class='shopping_cart_link']")private WebElement cart;
	@FindBy (xpath = "(//button[text()='Add to cart'])[1]")private WebElement addtocart;
	@FindBy (xpath = "//button[text()='Remove']")private WebElement remove;
	@FindBy (xpath = "//div[@class='inventory_item_name']")private WebElement productname;
	@FindBy (xpath = "//img[@class='inventory_item_img']")private WebElement productimg;
	@FindBy (xpath = "//a[text()='Logout']")private WebElement logout;
	
	public Products_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickMenu() {
		menu.click();
	}
	public void selectFilter(int indexno) {
		filter.click();
		Select slct = new Select(filter);
		slct.selectByIndex(indexno);
//		slct.selectByValue(value);
	}
	public void clickAddToCart() {
		//addtocart.findElement(By.id(passid)).click();
		addtocart.click();
	}
	public void clickRemove() {
		//addtocart.findElement(By.id(passid)).click();
		remove.click();
	}
	public void openCart() {
		cart.click();
	}
	public void clickProductImage() {
		
	}
	public void clickProductName() {
		
	}
    public void clickLogout() {  //Hidden popup
		logout.click();
	}
}
