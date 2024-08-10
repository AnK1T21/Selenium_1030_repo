package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterToApp {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-male")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Ankit");
    driver.findElement(By.id("LastName")).sendKeys("Kumar");
    driver.findElement(By.id("Email")).sendKeys("AnkitKumar1111");
    driver.findElement(By.id("Password")).sendKeys("11111111");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("111111111");
    driver.findElement(By.id("register-button")).click();
    
    
    
	}

}
