package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {

	public static void main(String[] args) {
    ChromeDriver driver=new  ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/");
    driver.findElement(By.name("username")).sendKeys("77777777777");
    driver.findElement(By.name("password")).sendKeys("aaaaaa1234");
	}

}
