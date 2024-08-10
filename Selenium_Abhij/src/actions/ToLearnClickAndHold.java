package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://yonobusiness.sbi/");
    driver.findElement(By.partialLinkText("LOGIN")).click();
    driver.findElement(By.id("password")).sendKeys("Test@123456789");
    WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
    Actions act=new Actions(driver);
    act.clickAndHold(eyeIcon).perform();
    Thread.sleep(2000);
    act.release(eyeIcon).perform();
	}

}
