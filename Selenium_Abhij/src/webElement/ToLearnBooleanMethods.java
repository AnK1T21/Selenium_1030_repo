package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
   
    driver.get("https://www.instagram.com/");
    Thread.sleep(2000);
    WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
    System.out.println("===before sending data===");
    System.out.println(loginbutton.isDisplayed());
    System.out.println(loginbutton.isEnabled());
    driver.findElement(By.name("username")).sendKeys("Ankit");
    driver.findElement(By.name("password")).sendKeys("12345678");
    System.out.println("===after sending data===");
    System.out.println(loginbutton.isDisplayed());
    System.out.println(loginbutton.isEnabled());
    
	}

}
