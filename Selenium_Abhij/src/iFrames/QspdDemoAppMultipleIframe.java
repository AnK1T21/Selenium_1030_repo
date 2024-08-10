package iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspdDemoAppMultipleIframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	    WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	    driver.switchTo().frame(frame1);
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    driver.switchTo().parentFrame();
	    WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.id("username")).sendKeys("abc123456");
	}

}
