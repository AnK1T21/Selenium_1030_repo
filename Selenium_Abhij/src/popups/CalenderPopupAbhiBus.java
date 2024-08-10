package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopupAbhiBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.get("https://www.abhibus.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).click();
	    int i=0;
	    while (true) {
	    	try {
				driver.findElement(By.xpath("//span[text()='September']/../../..//span[text()='20']")).click();
				break;
			} catch (Exception e) {
				if (i==0) {
					driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
					i++;
				}else {
					driver.findElement(By.xpath("(//span[@class='calender-month-change'])[2]")).click();
				}
				
				
			}
	    }
	}
}

