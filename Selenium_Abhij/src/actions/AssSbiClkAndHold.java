package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssSbiClkAndHold {

	public static void main(String[] args) throws InterruptedException, IOException {
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://yonobusiness.sbi/");
		    driver.findElement(By.partialLinkText("LOGIN")).click();
		    driver.findElement(By.id("password")).sendKeys("Test@123456789");
		    WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		    Actions act=new Actions(driver);
		    act.moveToElement(eyeIcon).clickAndHold(eyeIcon).perform();
		    File temp = driver.findElement(By.id("password")).getScreenshotAs(OutputType.FILE);
		    File dest = new File("./ScreenShots/passwordImg"+".png");
		    FileHandler.copy(temp, dest);
		    FileHandler.copy(temp, dest);
		    
	}

}
