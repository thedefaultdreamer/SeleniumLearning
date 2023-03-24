package newfeature;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ractangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		
		WebElement img = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		
		Rectangle rect = img.getRect();
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X Coord :"+rect.getX());
		System.out.println("Y Coord :"+rect.getY());
		
	}

}
