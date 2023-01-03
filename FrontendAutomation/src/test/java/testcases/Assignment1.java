package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Way2Automation");
		driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Way2Automation: Get Online Selenium Certification ')]")).click();
		
		List<WebElement> Links =  driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links: "+ Links.size());
		
		for (WebElement Link: Links) {
			System.out.println(Link.getText());
		}
	}

}
