package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TolearnRihtClick {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://demowebshop.tricentis.com/");
    Actions act = new Actions(driver);
    //act.contextClick().perform();
    WebElement registerLink = driver.findElement(By.linkText("Register"));
    act.contextClick(registerLink).perform();
	}

}
