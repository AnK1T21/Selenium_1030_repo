package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrormsgindemoshop {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("12345678");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    String capture = driver.findElement(By.className("validation-summary-errors")).getText();
    System.out.println(capture);
    String colour = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']")).getCssValue("color");
    System.out.println(colour);
    if(colour.equals(colour))
    {
    	System.out.println("test pass "+ colour);
    }
    else System.out.println("test fail");
	}
	
}

