package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void clickSS(WebDriver driver, String name) throws IOException {
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
		LocalDateTime datetime =LocalDateTime.now();
		
		DateTimeFormatter myFormate=DateTimeFormatter.ofPattern("dd-mm-yyyy HH_mm_ss");
		String timestamp= datetime.format(myFormate);
				
		File destination= new File("C:\\Users\\seema sahu\\Documents\\automation testing\\swagLabs\\screenshot\\" + name + "-" +timestamp+ ".png");
		FileHandler.copy(source, destination);
			 
	}
}
