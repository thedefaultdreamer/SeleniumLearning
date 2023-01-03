package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInDiffTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/wd");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement columnDriver =  driver.findElement(By.xpath("(//div[@class='footer_info-links-child'])[1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		for(int i=0; i<columnDriver.findElements(By.tagName("a")).size(); i++) {
			
		      String clickLInk = Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);
		      columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLInk);
		      Thread.sleep(1000);
		      			
		}
		
		java.util.Iterator<String> iter = driver.getWindowHandles().iterator();
		
		while (iter.hasNext()) {
			driver.switchTo().window(iter.next());
			System.out.println(driver.getTitle());
		}
  
		driver.quit();
	}

}
