package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotOfLoginErrormsg {

	public static void main(String[] args) throws IOException {
	String time = LocalDateTime.now().toString().replace(":", "-");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/login");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    File temp = driver.findElement(By.className("validation-summary-errors")).getScreenshotAs(OutputType.FILE);
    File dest = new File("./ScreenShots/emlementImg2"+time+".png");
    FileHandler.copy(temp, dest);
	}

}
