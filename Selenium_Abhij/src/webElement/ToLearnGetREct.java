package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetREct {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    Rectangle Rect = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
    System.out.println("Height: "+Rect.getHeight());
    System.out.println("Width: "+Rect.getWidth());
    System.out.println("X : "+Rect.getX());
    System.out.println("Y : "+Rect.getY());
    driver.quit();
	}

}
