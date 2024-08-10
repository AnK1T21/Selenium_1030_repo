package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateId {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");//Its is used to ender data into the text box(sendkeys)
    driver.findElement(By.id("Password")).sendKeys("abc123456");
	}

}
