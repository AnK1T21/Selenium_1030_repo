package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillaryA_ass_heiwidXY {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapp.skillrary.com/");
	    Rectangle capture = driver.findElement(By.xpath("//input[@class='form-control']")).getRect();
	    System.out.println(capture.getHeight()+ " HEIGHT ");
	    System.out.println(capture.getWidth()+ " WIDTH");
	    System.out.println(capture.getX()+ " X ");
	    System.out.println(capture.getY()+ " Y ");
	     WebElement capture2 = driver.findElement(By.xpath("//input[@class='form-control']"));
	    System.out.println(capture2.isEnabled());
	    System.out.println(capture2.isDisplayed());
	    
	    
	    
	    
	    
	    
	    
	}

}
