package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfElement {

	public static void main(String[] args) throws IOException {
	            LocalDateTime time = LocalDateTime.now();
	            String SystemTime = time.toString().replace(":", "-");
	    //String SystemTime = LocalDateTime.now().toString().replace(":", "-");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    File temp = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
    File dest = new File("./ScreenShots/emlementImg"+SystemTime+".png");
    FileHandler.copy(temp, dest);
	}

}
