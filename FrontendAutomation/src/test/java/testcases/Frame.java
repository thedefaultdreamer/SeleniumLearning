package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("_1YPz_")).click();
		System.out.println("Counts of iframe:--> "+driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[@event-label='ios']")).click();
		System.out.println("Clicked on ios logo");
	}

}
