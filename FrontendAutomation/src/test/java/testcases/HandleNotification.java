package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(o);
		driver.get("https://www.justdial.com/Bangalore/Bakeries");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
