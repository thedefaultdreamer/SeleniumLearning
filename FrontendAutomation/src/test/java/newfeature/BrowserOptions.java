package newfeature;

import java.util.Collections;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("headless");
		opt.addArguments("incognito");
		opt.setAcceptInsecureCerts(true);
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		opt.addArguments("window-size=1920,1080");
		
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://selenium.dev/");

	}

}
