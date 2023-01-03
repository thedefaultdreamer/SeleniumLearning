package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flygofirst.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='roundTripbd']/div/div[@class='fromTo-multipleDate']/div/div/input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		
	
		
	}

}
