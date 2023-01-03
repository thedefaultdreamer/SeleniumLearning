package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("palash");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		alert.accept();
		
		driver.quit();
	}

}
