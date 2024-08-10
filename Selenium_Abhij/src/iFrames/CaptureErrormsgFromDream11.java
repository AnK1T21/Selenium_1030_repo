package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrormsgFromDream11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.dream11.com/");
	    //driver.switchTo().frame(0);//By using iframe By id
	    //driver.switchTo().frame("send-sms-iframe");//By Using iframe by id or string
	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
	    driver.switchTo().frame(frameElement);
	    WebElement errorMsg = driver.findElement(By.id("regEmail"));
	    errorMsg.sendKeys("12345678999");
	    //driver.switchTo().defaultContent();//(Switch Driver Control By Using DefaultContent)
	      driver.switchTo().parentFrame();//(Switch Driver Control By Using parentFrame)
	    driver.findElement(By.id("hamburger")).click();
	    
	}

}
