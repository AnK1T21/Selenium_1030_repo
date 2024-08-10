package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalsPopup {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://the-internet.herokuapp.com/entry_ad");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("click here")).click();
	    driver.findElement(By.xpath("//p[text()='Close']")).click();
	}

}
