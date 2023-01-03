package testcases;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa.Way2Automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement above = driver.findElement(with(By.name("name")).above(By.name("phone")));
		above.sendKeys("Palash Patidar");
		
		WebElement button = driver.findElement(with(By.tagName("input")).toRightOf(By.linkText("Signin")));
		button.click();
		
		System.out.println("success");
		driver.quit();
	}

}
