package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    Alert promptpopup = driver.switchTo().alert();
	    promptpopup.sendKeys("Selenium");
	    Thread.sleep(2000);
	    
	    String msg = promptpopup.getText();
	    System.out.println(msg);
	    promptpopup.accept();
	    String text = driver.findElement(By.id("demo")).getText();
	    System.out.println(text);
	}

}
