package test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.Products_page;
import pom.Login_page;
import utility.parametrization;

public class ProductsTest {
WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver= Browser.launchChrome();
		
	}
	@Test(priority=1)
	private void login() throws EncryptedDocumentException, IOException {
		Login_page swaglabsLogin_page = new Login_page(driver);
		String un =parametrization.getExcelData("Credentials", 1, 0);
		String pw =parametrization.getExcelData("Credentials", 1, 1);
		swaglabsLogin_page.enteruserName(un);
		swaglabsLogin_page.enterPassword(pw);
		swaglabsLogin_page.clickOnlogin();
		String ExpectedTitle = "Swag Labs";
		String ActualTitle= driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	@Test
	public void ProductsTest() {
		
		Products_page products_page= new Products_page(driver);
		
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		
//		products_page.AddToCart();
		
		
	}
	

}
