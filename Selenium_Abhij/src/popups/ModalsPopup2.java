package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalsPopup2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.woodenstreet.com/");
	    Thread.sleep(5000);
	    driver.findElement(By.id("loginclose1")).click();

	}

}
