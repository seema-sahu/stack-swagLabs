package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
	@FindBy (xpath = "//div[@class='inventory_item_name']")private WebElement productname;
	@FindBy (xpath = "//button[@name='finish']")private WebElement finish;
	@FindBy (xpath = "//button[@id='cancel']")private WebElement cancel;
	@FindBy (xpath = "//div[@class='summary_total_label']")private WebElement totalamount;
	
	public OverviewPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickProductName() {
		productname.click();
	}
	public void clickFinish() {
		finish.click();
	}
	public void clickCancel() {
		cancel.click();
	}
	public void checkTotalAmount() {
		totalamount.isDisplayed();
	}

}
//div[@class='summary_total_label']
