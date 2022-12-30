package testcases;
 
import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestFullPageScreenshot {
 
	public static void main(String[] args) throws IOException {
 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();
		
		if(driver instanceof FirefoxDriver) {	
			//Full Page
			File fullPage = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPage, new File("./screenshot/fullpage.jpg"));
					
		}else if(driver instanceof ChromeDriver) {
			//Visible page	
			File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(pageScreenshot, new File("./screenshot/page.jpg"));
			
		}

	}
 
}