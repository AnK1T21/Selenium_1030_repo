package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginInDemoWebShp {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.xpath("//a[text()='Log in']")).click();
    driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("äk123456@gmail.com");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
    
	}

}
