package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCapturedemoerror {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.id("newsletter-subscribe-button")).click();
    Thread.sleep(2000);
    WebElement alert = driver.findElement(By.id("newsletter-result-block"));
    System.out.println(alert.getText());
	}

}
