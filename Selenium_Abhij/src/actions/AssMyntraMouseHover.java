package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssMyntraMouseHover {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://www.myntra.com/");
	    WebElement menicon = driver.findElement(By.xpath("//a[text()='Men']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(menicon).perform();
	    WebElement shoe = driver.findElement(By.xpath("//a[text()='Casual Shoes']"));
	    act.moveToElement(shoe).click().perform();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShots/myntramen.png");
	    FileHandler.copy(temp, dest);    
	}

}
