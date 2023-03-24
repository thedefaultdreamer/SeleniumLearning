package newfeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int s = driver.findElements(By.tagName("iframe")).size();	
		System.out.println(s);
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"nav_translate_btn\"]/i")).click();
		
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("/html/body/button")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	}

}
