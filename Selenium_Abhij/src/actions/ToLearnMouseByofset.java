package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseByofset {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
    WebElement passtf = driver.findElement(By.id("password"));
    passtf.sendKeys("Test@1234");
    Actions act=new Actions(driver);
    act.moveByOffset(1296, 316).clickAndHold().perform();
	}

}
