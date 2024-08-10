package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrorMsgfromdream11 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.dream11.com/");
    WebElement capture = driver.findElement(By.id("regEmail"));
    capture.sendKeys("12345678977");
    Thread.sleep(2000);
    driver.findElement(By.id("errorMob")).getText();
    
    
    
	}

}
