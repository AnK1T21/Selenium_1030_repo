package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmationpopup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demo.guru99.com/test/delete_customer.php/delete_customer.php");
	    driver.findElement(By.name("submit")).click();
	    Alert comfirmPopup = driver.switchTo().alert();
	    comfirmPopup.accept();
	    System.out.println(comfirmPopup.getText());
	    comfirmPopup.accept();
	}

}
