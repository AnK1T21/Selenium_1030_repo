package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AletPopup {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://demowebshop.tricentis.com/");
    driver.findElement(By.xpath("//input[@value='Search']")).click();
    Alert alertpopup = driver.switchTo().alert();
    Thread.sleep(2000);
    String popmsg = alertpopup.getText();
    System.out.println(popmsg);
    alertpopup.accept();
    
	}

}
